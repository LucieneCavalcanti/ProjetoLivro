/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.pro.luciene.ProjetoVendas.relatorios;

/**
 *
 * @author Diretor
 */
import java.io.IOException;
import java.io.StringReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

import javax.swing.text.BadLocationException;
import javax.swing.text.rtf.RTFEditorKit;

import net.sf.jasperreports.engine.JasperManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.view.JasperViewer;

public class RelatorioManual {


/* Primeira parte */



   private Connection con = null;
   private String driver = "com.mysql.jdbc.Driver";
   private String endereco = "localhost:3306";
   private String user = "root";
   private String pass = "root";
   private ResultSet rs = null;
   private String valores[] = new String[10];
   private int chamada = 1;
   private String dir = "C:\\Luciene\\2009\\projeto_loja_v3\\src\\relatorios\\";
   private StringReader stream;
   /*Segunda parte */

   public RelatorioManual() {
      /* Efetua a conexao a base de dados e coleta os valores da base de dados armazenando-os
       em um array para ser futuramente utilizado */
      try {
         if (con == null) {
            Class.forName(driver);
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_java?user=root&password=root");
            Statement statement = con.createStatement();
            rs = statement.executeQuery("SELECT * FROM categorias order by descricao");
            HashMap teste = new HashMap();
            while(rs.next()) {
               //for até o numero de campos da tabela
               for (int i = 1; i < 3; i++) {
                  valores[i] = rs.getString(i);
               }
            }
         }
      }
      catch (Exception e) {
         System.err.println("Problemas apresentados na operacao de conexao" + e.getMessage());
         //e.printStackTrace();
      }
      /* Inicio do bloco que ira gerar nossos relatorios e 3ª parte */
      try {
         String array[] = valores;
         JasperDesign design = JasperManager.loadXmlDesign(dir + "rel_categorias.jrxml");
         JasperReport jr = JasperManager.compileReport(design);
         HashMap parameters = new HashMap();
         parameters.put("PARAMETRO_1",array[1]);
         parameters.put("PARAMETRO_2", array[2]);
         parameters.put("PARAMETRO_3", array[5]);
         parameters.put("PARAMETRO_4", array[4]);
         parameters.put("PARAMETRO_5",array[9]);
         JasperPrint impressao = JasperManager.fillReport(jr,parameters,con);
         JasperViewer jrviewer = new JasperViewer(impressao,false);
         jrviewer.show();
      }
      catch (Exception e) {
         e.printStackTrace();
      }
   }
   /* Aqui chamamos o construtor de nossa classe para exibirmos o relatorio e 4ª parte*/
   public static void main (String args[]) {
      new RelatorioManual();
      System.out.println("ok");
   }

}
