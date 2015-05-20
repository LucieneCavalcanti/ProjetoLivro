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
