/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.luciene.ProjetoVendas.data;

import br.pro.luciene.ProjetoVendas.model.Situacao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

/**
 *
 * @author MAQLAB2015
 */
public class SituacaoData extends Conexao {
    public SituacaoData() throws Exception {}
    public boolean incluir(Situacao obj) throws Exception {
        String sql= "Insert into TabSituacoes (descricao) values (?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, obj.getDescricao());
        int registros = ps.executeUpdate();
        if(registros>0)
            return true;
        else
            return false;
    }
    public Vector pesquisar(String arg) throws Exception {
        Vector dados = new Vector();
        String sql="Select * from TabSituacoes where descricao like '"
                +arg+"%' order by descricao";
        PreparedStatement  ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Vector novalinha = new Vector();
            novalinha.add(rs.getInt("idSituacao"));
            novalinha.add(rs.getString("descricao"));
            dados.add(novalinha);
        }
        return dados;
    }
    
    
    
    
    
  
    public Vector<Situacao> carregarCombo() throws Exception {
        Vector<Situacao> vetor = new Vector<Situacao>();
        String sql = "Select * from TabSituacoes order by descricao";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            vetor.add(new Situacao(rs.getInt("idSituacao"), 
                    rs.getString("descricao")));
        }
        return vetor;
    }
}
