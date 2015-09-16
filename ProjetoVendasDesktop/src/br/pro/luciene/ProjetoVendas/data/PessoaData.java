/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.pro.luciene.ProjetoVendas.data;

import br.pro.luciene.ProjetoVendas.model.Cliente;
import br.pro.luciene.ProjetoVendas.model.Fornecedor;
import br.pro.luciene.ProjetoVendas.model.Funcionario;
import br.pro.luciene.ProjetoVendas.model.Pessoa;
import br.pro.luciene.ProjetoVendas.model.Situacao;
import br.pro.luciene.ProjetoVendas.model.Telefone;
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
        if(ps.executeUpdate()>0){ //se executar o insert pessoa
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
                    if(ps3.executeUpdate()>0){//incluir telefones
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
        if(campo==5){
            sql+=" as p, TabTelefones as t where p.idPessoa=t.idPessoa"+
                 " and numero like'"+pesq+"%' order by numero";
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
            if(campo==5)  novalinha.add("[ "+rs.getString("tipo")+" ] " + 
                    "(" + rs.getString("ddd")+") - " 
                    + rs.getString("numero"));
            dados.add(novalinha);
        }
        return dados;
    }
    public Cliente obterCliente(int id) throws Exception {
        Cliente obj = null;
        String sql = "Select * from TabPessoas as p, TabPessoaFisica as f, "
         + "TabClientes as c, TabSituacoes as s "
         + "where p.idPessoa=? and p.idPessoa=f.idPessoaFisica "
         + "and f.idPessoaFisica=c.idCliente "
         + "and p.idSituacao=s.idSituacao";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1,id);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            obj = new Cliente();
            obj.setIdPessoa(rs.getInt("idPessoa"));
            obj.setNome(rs.getString("nome"));
            obj.setBairro(rs.getString("bairro"));
            obj.setCep(rs.getString("cep"));
            obj.setCidade(rs.getString("cidade"));
            obj.setComplemento(rs.getString("complemento"));
            obj.setCpf(rs.getString("cpf"));
            obj.setDataCadastro(rs.getTimestamp("dataCadastro"));
            obj.setDataNascimento(rs.getTimestamp("dataNascimento"));
            obj.setEmail(rs.getString("email"));
            obj.setEmpresa(rs.getString("empresa"));
            obj.setEndereco(rs.getString("endereco"));
            obj.setNumero(rs.getString("numero"));
            obj.setRg(rs.getString("rg"));
            obj.setUf(rs.getString("uf"));
            obj.setSituacao(new Situacao(rs.getInt("idSituacao"),
                    rs.getString("descricao")));
            String sql2 = "Select * from TabTelefones where"
                    + " idPessoa = ?";
            PreparedStatement ps2 = getConexao().prepareStatement(sql2);
            ps2.setInt(1,id);
            ResultSet rs2 = ps2.executeQuery();
            while(rs2.next()){
                Telefone objTel = new Telefone();
                objTel.setDdd(rs2.getString("ddd"));
                objTel.setSequencia(rs2.getInt("sequencia"));
                objTel.setTelefone(rs2.getString("numero"));
                objTel.setTipo(rs2.getString("tipo"));
                obj.adicionarTelefone(objTel);
            }
        }
        return obj;
    }
    
    public Funcionario obterFuncionario(int id) throws Exception {
        Funcionario obj = null;
        String sql = "Select * from TabPessoas as p, TabPessoaFisica as f, "
         + "TabFuncionarios as fun, TabSituacoes as s "
         + "where p.idPessoa=? and p.idPessoa=f.idPessoaFisica "
         + "and f.idPessoaFisica=fun.idFuncionario "
         + "and p.idSituacao=s.idSituacao";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1,id);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            obj = new Funcionario();
            obj.setIdPessoa(rs.getInt("idPessoa"));
            obj.setNome(rs.getString("nome"));
            obj.setBairro(rs.getString("bairro"));
            obj.setCep(rs.getString("cep"));
            obj.setCidade(rs.getString("cidade"));
            obj.setComplemento(rs.getString("complemento"));
            obj.setCpf(rs.getString("cpf"));
            obj.setDataCadastro(rs.getTimestamp("dataCadastro"));
            obj.setDataNascimento(rs.getTimestamp("dataNascimento"));
            obj.setEmail(rs.getString("email"));
            obj.setCTPS(rs.getString("ctps"));
            obj.setCargo(rs.getString("cargo"));
            obj.setDepartamento(rs.getString("departamento"));
            obj.setSenha(rs.getString("senha"));
            obj.setEndereco(rs.getString("endereco"));
            obj.setNumero(rs.getString("numero"));
            obj.setRg(rs.getString("rg"));
            obj.setUf(rs.getString("uf"));
            obj.setSituacao(new Situacao(rs.getInt("idSituacao"),
                    rs.getString("descricao")));
            String sql2 = "Select * from TabTelefones where"
                    + " idPessoa = ?";
            PreparedStatement ps2 = getConexao().prepareStatement(sql2);
            ps2.setInt(1,id);
            ResultSet rs2 = ps2.executeQuery();
            while(rs2.next()){
                Telefone objTel = new Telefone();
                objTel.setDdd(rs2.getString("ddd"));
                objTel.setSequencia(rs2.getInt("sequencia"));
                objTel.setTelefone(rs2.getString("numero"));
                objTel.setTipo(rs2.getString("tipo"));
                obj.adicionarTelefone(objTel);
            }
        }
        return obj;
    }

    public Fornecedor obterFornecedor(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
