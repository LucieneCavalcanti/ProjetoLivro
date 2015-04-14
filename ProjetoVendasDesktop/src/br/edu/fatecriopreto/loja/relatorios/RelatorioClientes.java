
package br.edu.fatecriopreto.loja.relatorios;

/**
 *
 * @author Adriano
 */

import br.edu.fatecriopreto.loja.data.Conexao;
import javax.swing.JOptionPane;

import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class RelatorioClientes {
    
    
 public RelatorioClientes() {
  try 
  {
        Conexao con = new Conexao();
         
        JasperReport relatorio = (JasperReport) JRLoader.
loadObject("C:\\Luciene\\2008\\projeto_loja\\src\\Relatorios\\clientes.jasper"); 
        JasperPrint impressao = JasperFillManager.fillReport(relatorio, 
                null, con.getConexao());
        JasperViewer visualizador = new JasperViewer(impressao, false); 
        visualizador.setVisible(true); 

  } catch (Exception erro){
             JOptionPane.showMessageDialog(null,"deu erro ="+erro);
   }
}

  public static void main (String args[]) 
  {
    new RelatorioClientes(); 
    
    
  }
}


