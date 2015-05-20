/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.pro.luciene.ProjetoVendas.data;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Luciene
 */
public class testeProcedure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CategoriaDAO DAO = new CategoriaDAO();
        try {
            Conexao con = new Conexao();
            String sql="Insert into usuarios values('fernando','f123',1)";
            PreparedStatement pstmt = con.getConexao().prepareStatement(sql);
            int registros = pstmt.executeUpdate();
            if (registros==1)
                JOptionPane.showMessageDialog(null, "Incluído com sucesso: " );
            else
                JOptionPane.showMessageDialog(null, "Erro ao incluir" );
                
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + erro.getMessage());
        }
    }

}
