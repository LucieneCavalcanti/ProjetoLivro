/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.pro.luciene.ProjetoVendas.data;

import br.pro.luciene.ProjetoVendas.model.Saida;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Luciene
 */
public class SaidaData extends Conexao {
    public SaidaData() throws Exception {}
    public boolean incluir(Saida obj) throws Exception {
        //sem baixar estoque
        getConexao().setAutoCommit(false);
        String sql= "Insert into TabSaidas " +
                "(idTipo,idCliente,idFuncionario,comissao,"
                + "dataSaida,desconto,idSituacao) " +
                "values (?,?,?,?,?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, obj.getTipoMovimento().getIdTipo());
        ps.setInt(2, obj.getCliente().getIdPessoa());
        ps.setInt(3, obj.getFuncionario().getIdPessoa());
        ps.setDouble(4,obj.getComissao());
        ps.setTimestamp(5, obj.getDataSaida());
        ps.setDouble(6, obj.getDesconto());
        ps.setInt(7,obj.getSituacao().getIdSituacao());
        if(ps.executeUpdate()>0){
            String sql2="select max(idSaida) as id";
            PreparedStatement ps2 = getConexao().prepareStatement(sql2);
            ResultSet rs = ps2.executeQuery();
            int id=0;
            if(rs.next()){
                id=rs.getInt("id");
            }
            for(int i=0;i<obj.getItensSaida().size();i++){
                String sql3 = "Insert into TabSaidasItens "+
                        "(idSaida,idProduto,quantidade,valorUnitario,valorDesconto)"+
                        "(?,?,?,?,?)";
                PreparedStatement ps3 = getConexao().prepareStatement(sql3);
                ps3.setInt(1,id);
                ps3.setInt(2,obj.getItensSaida().get(i).getProduto().getIdProduto());
                ps3.setDouble(3,obj.getItensSaida().get(i).getQuantidade());
                ps3.setDouble(4,obj.getItensSaida().get(i).getValorUnitario());
                ps3.setDouble(5,obj.getItensSaida().get(i).getValorDesconto());
                if(ps3.executeUpdate()==0) {
                    getConexao().rollback();
                    getConexao().setAutoCommit(true);
                    throw new Exception("Erro ao inserir itens: "+i);
                }
            }
        }
        getConexao().commit();
        getConexao().setAutoCommit(true);
        return true;
    }
}
