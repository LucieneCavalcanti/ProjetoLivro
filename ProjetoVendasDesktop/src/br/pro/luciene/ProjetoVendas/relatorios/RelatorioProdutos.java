
package br.pro.luciene.ProjetoVendas.relatorios;

/**
 *
 * @author Adriano
 */

import br.pro.luciene.ProjetoVendas.data.CategoriaData;
import br.pro.luciene.ProjetoVendas.data.Conexao;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class RelatorioProdutos {
    
    
 public RelatorioProdutos() {
  try 
  {
        Conexao con = new Conexao();
         
        JasperReport relatorio = (JasperReport) JRLoader.loadObject("D:\\LP II\\2009\\projeto_loja\\src\\Relatorios\\produtos.jasper");
        JasperPrint impressao = JasperFillManager.fillReport(relatorio, null, con.getConexao());
        JasperViewer visualizador = new JasperViewer(impressao, false); 
        visualizador.setVisible(true); 

  } catch (Exception erro){
             JOptionPane.showMessageDialog(null,"deu erro ="+erro);
   }
}

  public static void main (String args[]) 
  {
    new RelatorioProdutos(); 
    
    
  }
}


