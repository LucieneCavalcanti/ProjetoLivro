package br.pro.luciene.ProjetoVendas.relatorios;
import java.util.HashMap;
import br.pro.luciene.ProjetoVendas.data.CategoriaData;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class RelatorioCategorias {
public RelatorioCategorias() {
  try 
  {
      JRResultSetDataSource jrRS = new JRResultSetDataSource(new CategoriaData().relatorio());
      JasperPrint jasperPrint = JasperFillManager.fillReport(
      "D:\\LP II\\2009\\projeto_loja_v3\\src\\relatorios\\categorias2.jasper", new HashMap(), jrRS);
      JasperViewer.viewReport(jasperPrint,false);
  } catch (Exception erro){
             JOptionPane.showMessageDialog(null,"deu erro ="+erro);
   }
}
  public static void main (String args[]) 
  {
   new RelatorioCategorias();
  }
}


