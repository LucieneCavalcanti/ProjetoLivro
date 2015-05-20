/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.pro.luciene.ProjetoVendas.relatorios;

//import com.lowagie.text.pdf.codec.Base64.InputStream;
import java.io.File;
import java.util.HashMap;
//import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Diretor
 */
public class inicio {

    public void exibirRelatorio() {

//        // Caminho onde está o  arquivo .jasper
//        String caminhoRelJasper = "C:"+File.separator+"develop"+
//        File.separator+"code"+File.separator+"report-gi"+File.separator+
//        "webapp"+File.separator+"WEB-INF"+File.separator+"jasper"+
//        File.separator+"Boleto.jasper";
//
//        // Armazena em uma lista os dados que vc irá imprimir
//        //List listaLivros = getLivros();
//
//
//        // Stream com o .jasper
//        //InputStream relJasper = getClass().getResourceAsStream(caminhoRelJasper);
//
//        // O datasource
//        //JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(listaLivros);
//
//        // Parametros do relatorios
//        Map parametros = new HashMap();
//
//        JasperPrint impressao = new JasperPrint();
//
//        try {
//
//            impressao = JasperFillManager.fillReport(caminhoRelJasper ,parametros, ds);
//
//            JasperViewer viewer = new JasperViewer(impressao, true);
//            viewer.setVisible(true);
//                                                //Nome e diretorio onde vai ser gerado o PDF
//            String destFileName  ="C:\\geraPDF.pdf";
//            JasperExportManager.exportReportToPdfFile(impressao,destFileName);
//            //JasperExportManager.exportReportToHtmlFile(impressao,destFileNameHTML);
//        } catch (JRException e) {
//            System.out.println(e.getMessage());
//            System.out.println("PRINTSTACKTRACE = ");
//            e.printStackTrace();
//        }

    }
}