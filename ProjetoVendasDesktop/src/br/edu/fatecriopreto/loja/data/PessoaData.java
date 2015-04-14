/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.fatecriopreto.loja.data;

import br.edu.fatecriopreto.loja.model.Cliente;
import br.edu.fatecriopreto.loja.model.Fornecedor;
import br.edu.fatecriopreto.loja.model.Funcionario;
import br.edu.fatecriopreto.loja.model.Pessoa;
import br.edu.fatecriopreto.loja.model.Telefone;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Luciene
 */
public class PessoaData extends Conexao{
    public PessoaData() throws Exception {}
    public boolean incluir(Pessoa pessoa) throws Exception{
        getConexao().setAutoCommit(false);
        String sql = "Insert into TabPessoas "+
                "(nome,email,endereco,numero,bairro,"
                + "complemento,cep,cidade,uf,situacao,"
                + "dataCadastro) values (?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, pessoa.getNome());
        ps.setString(2, pessoa.getEmail());
        ps.setString(3, pessoa.getEndereco());
        ps.setString(4, pessoa.getNumero());
        ps.setString(5, pessoa.getBairro());
        ps.setString(6, pessoa.getComplemento());
        ps.setString(7, pessoa.getCep());
        ps.setString(8, pessoa.getCidade());
        ps.setString(9, pessoa.getUf());
        ps.setInt(10, pessoa.getSituacao().getIdSituacao());
        ps.setTimestamp(11, pessoa.getDataCadastro());
        if(ps.executeUpdate()>0){ //executar o insert pessoa
            int idPessoa = 0;
            String sqlPessoa="Select max(idPessoa) as id from TabPessoas";
            PreparedStatement psPessoa = getConexao().prepareStatement(sqlPessoa);
            ResultSet rs = psPessoa.executeQuery();
            if (rs.next()) idPessoa = rs.getInt("id");
            if(pessoa instanceof Cliente){
                Cliente cliente = (Cliente)pessoa;
                String sql2="insert into TabPessoaFisica "+
                        "(idPessoaFisica,cpf,rg,datanascimento) "+
                        "values (?,?,?,?)";
                PreparedStatement ps2 = getConexao().prepareStatement(sql2);
                ps2.setInt(1,idPessoa);
                ps2.setString(2,cliente.getCpf());
                ps2.setString(3,cliente.getRg());
                ps2.setTimestamp(4, cliente.getDataNascimento());
                if(ps2.executeUpdate()>0){ //insert PF
                    String sql3="insert into TabClientes (idCliente,empresa) "
                        + "values (?,?)";
                    PreparedStatement ps3 = getConexao().prepareStatement(sql3);
                    ps3.setInt(1,idPessoa);
                    ps3.setString(2,cliente.getEmpresa());
                    if(ps3.executeUpdate()>0){
                        //telefones
                        if(incluirTelefones(cliente.getTelefones(), idPessoa))
                            getConexao().commit(); 
                        else {
                            getConexao().rollback();
                            return false; }
                    } else {
                        getConexao().rollback();
                        return false;
                    }
                } else {
                    getConexao().rollback();
                    return false;
                }
            }
            if(pessoa instanceof Funcionario){
                Funcionario funcionario = (Funcionario)pessoa;
                String sql2="insert into TabPessoaFisica "+
                        "(idPessoaFisica,cpf,rg,datanascimento) "+
                        "values (?,?,?,?)";
                PreparedStatement ps2 = getConexao().prepareStatement(sql2);
                ps2.setInt(1,idPessoa);
                ps2.setString(2,funcionario.getCpf());
                ps2.setString(3,funcionario.getRg());
                ps2.setTimestamp(4, funcionario.getDataNascimento());
                if(ps2.executeUpdate()>0){
                String sql3="insert into TabFuncionario "
                        + "(idFuncionario,ctps,cargo,departamento) "
                        + "values(?,?,?,?)";
                PreparedStatement ps3 = getConexao().prepareStatement(sql3);
                ps3.setInt(1,idPessoa);
                ps3.setString(2, funcionario.getCTPS());
                ps3.setString(3,funcionario.getCargo());
                ps3.setString(4,funcionario.getDepartamento());
                if(ps3.executeUpdate()>0){
                    //telefones
                    if(incluirTelefones(funcionario.getTelefones(), idPessoa))
                        getConexao().commit(); 
                    else {
                        getConexao().rollback();
                        return false; }
                }
                }
            }
            if(pessoa instanceof Fornecedor){
                Fornecedor fornecedor = (Fornecedor)pessoa;
                String sql2="insert into TabPessoaJuridica "
                        + "(idPessoaJuridica,cnpj,ie) "
                        + "values(?,?,?)";
                PreparedStatement ps2 = getConexao().prepareStatement(sql2);
                ps2.setInt(1,idPessoa);
                ps2.setString(2,fornecedor.getCnpj());
                ps2.setString(3,fornecedor.getIe());
                if(ps2.executeUpdate()>0){
                    String sql3="insert into TabFornecedores "
                        + "(idFornecedor,idMatricula,nomeVendedor) "
                        + "values(?,?,?)";
                    PreparedStatement ps3 = getConexao().prepareStatement(sql3);
                    ps3.setInt(1,idPessoa);
                    ps3.setInt(2,fornecedor.getIdMatricula());
                    ps3.setString(3,fornecedor.getNomeVendedor());
                    if(ps3.executeUpdate()>0){
                        //telefones
                        if(incluirTelefones(fornecedor.getTelefones(), idPessoa))
                            getConexao().commit(); 
                        else {
                            getConexao().rollback();
                            return false; }
                    }
                }
            }
        
    } else {
        getConexao().rollback();
        return false;
    }
    getConexao().setAutoCommit(true);
    return true;
    }
    private boolean incluirTelefones(List<Telefone> telefones,int idPessoa)
            throws Exception{
        for(int i=0;i<telefones.size();i++){
            String sql = "insert into TabTelefones(idPessoa,tipo,ddd,numero) "
                + "values (?,?,?,?)";
            PreparedStatement ps = getConexao().prepareStatement(sql);
            ps.setInt(1,idPessoa);
            ps.setString(2,telefones.get(i).getTipo());
            ps.setString(3,telefones.get(i).getDdd());
            ps.setString(4, telefones.get(i).getTelefone());
            if(ps.executeUpdate()==0) //não executar
                return false;
        }
        return true;
    }
    public Vector pesquisar(int campo, String pesq) throws Exception {
        Vector dados = new Vector();
        String sql = "Select * from TabPessoas";
        if(campo==0){ //id
            sql+= " where idPessoa="+pesq+" order by idPessoa";
        }
        if(campo==1) {//nome
            sql+= " where nome like '"+pesq+"%' order by nome";
        }
        if(campo==2) { //cpf
            sql+=" , TabPessoaFisica where idPessoa=idPessoaFisica"+
                 " and cpf like '"+pesq+"%' order by cpf";
        }
        if(campo==3) { //cnpj
            sql+=" , TabPessoaJuridica where idPessoa=idPessoaJuridica"+
                 " and cnpj like '"+pesq+"%' order by cnpj";
        }
        if(campo==4) { //fornecedor
            sql+=" , TabPessoaJuridica, TabFornecedor"+
                 " where idPessoa=idPessoaJuridica"+
                 " and idPessoaJuridica=idFornecedor"+
                 " and nomeVendedor like '"+pesq+"%' order by nomeVendedor";
        }
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Vector novalinha = new Vector();
            novalinha.add(rs.getString("idPessoa"));
            novalinha.add(rs.getString("nome"));
            if(campo==2)  novalinha.add(rs.getString("cpf"));
            if(campo==3)  novalinha.add(rs.getString("cnpj"));
            if(campo==4)  novalinha.add(rs.getString("nomeVendedor"));
            dados.add(novalinha);
        }
        return dados;
    }
}
