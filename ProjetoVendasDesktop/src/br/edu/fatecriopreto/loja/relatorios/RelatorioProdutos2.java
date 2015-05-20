/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.fatecriopreto.loja.relatorios;

import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import br.edu.fatecriopreto.loja.data.ProdutoData;

/**
 *
 * @author Diretor
 */
public class RelatorioProdutos2 {
public RelatorioProdutos2(){
    try
  {
//        Conexao con = new Conexao();
//
//        JasperReport relatorio = (JasperReport) JRLoader.
//loadObject("C:\\Luciene\\2008\\projeto_loja\\src\\Relatorios\\clientes.jasper");
//        JasperPrint impressao = JasperFillManager.fillReport(relatorio,
//                null, con.getConexao());
//        JasperViewer visualizador = new JasperViewer(impressao, false);
//        visualizador.setVisible(true);
//
//  } catch (Exception erro){
//             JOptionPane.showMessageDialog(null,"deu erro ="+erro);
//   }
        


      JRResultSetDataSource jrRS = new JRResultSetDataSource(new ProdutoData().Relatorio());

      JasperPrint jasperPrint = JasperFillManager.fillReport(
      "C:\\Luciene\\2009\\projeto_loja_v3\\src\\relatorios\\rel_produtos2.jasper", new HashMap(), jrRS);
      JasperViewer.viewReport(jasperPrint);
  } catch (Exception erro){
             JOptionPane.showMessageDialog(null,"Deu erro ="+erro);
   }
}
    public static void main(String[] args) {
        new RelatorioProdutos2();
    }
}