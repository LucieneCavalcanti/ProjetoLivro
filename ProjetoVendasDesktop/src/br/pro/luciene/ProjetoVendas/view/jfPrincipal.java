/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * jfPrincipal.java
 *
 * Created on 31/03/2009, 20:18:34
 */
package br.pro.luciene.ProjetoVendas.view;

import br.pro.luciene.ProjetoVendas.data.Conexao;
import br.pro.luciene.ProjetoVendas.extras.datas;
import java.util.HashMap;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Alunos
 */
public class jfPrincipal extends javax.swing.JFrame {

    jifPessoas objForn;
    jifCategorias objCli;
    jifProdutos objProd;
    jifPesquisaGeral objPesquisa;
    Conexao con;

    /**
     * Creates new form jfPrincipal
     */
    public jfPrincipal() {
        initComponents();
        jlData.setText(datas.pegarDataExtensoBrasileira());
//        setExtendedState(MAXIMIZED_BOTH);
        try {
            con = new Conexao();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Erro: "
                    + erro.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPrincipal = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jldesenvolvimento = new javax.swing.JLabel();
        jlData = new javax.swing.JLabel();
        jlHora = new javax.swing.JLabel();
        barra_menus = new javax.swing.JMenuBar();
        jmCadastros = new javax.swing.JMenu();
        jmPessoas = new javax.swing.JMenuItem();
        jifFuncionarios = new javax.swing.JMenuItem();
        jmProdutos = new javax.swing.JMenuItem();
        jmiTipoMovimento = new javax.swing.JMenuItem();
        jmiSituacoes = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jmSair = new javax.swing.JMenuItem();
        jmMovimentos = new javax.swing.JMenu();
        jmCompra = new javax.swing.JMenuItem();
        jmVenda = new javax.swing.JMenuItem();
        jmRelatorios = new javax.swing.JMenu();
        jmiRelCategorias = new javax.swing.JMenuItem();
        jmiRelModulos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Controle de Estoque");
        getContentPane().setLayout(null);

        jLabel1.setText("jLabel1");
        jdpPrincipal.add(jLabel1);
        jLabel1.setBounds(524, 20, 240, 210);

        getContentPane().add(jdpPrincipal);
        jdpPrincipal.setBounds(0, 0, 774, 610);

        jldesenvolvimento.setFont(new java.awt.Font("Calisto MT", 3, 14)); // NOI18N
        jldesenvolvimento.setText("Desenvolvido por Fatec Rio Preto");
        getContentPane().add(jldesenvolvimento);
        jldesenvolvimento.setBounds(10, 620, 392, 17);

        jlData.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jlData);
        jlData.setBounds(320, 620, 202, 17);

        jlHora.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlHora.setOpaque(true);
        jlHora = new br.pro.luciene.ProjetoVendas.extras.relogio();
        getContentPane().add(jlHora);
        jlHora.setBounds(610, 620, 160, 17);

        jmCadastros.setText("Cadastros");

        jmPessoas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jmPessoas.setText("Pessoas");
        jmPessoas.setToolTipText("Cadastro de Pessoas");
        jmPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPessoasActionPerformed(evt);
            }
        });
        jmCadastros.add(jmPessoas);

        jifFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        jifFuncionarios.setText("Funcionários");
        jifFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jifFuncionariosActionPerformed(evt);
            }
        });
        jmCadastros.add(jifFuncionarios);

        jmProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        jmProdutos.setText("Produtos");
        jmProdutos.setToolTipText("Cadastro de Produtos");
        jmProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProdutosActionPerformed(evt);
            }
        });
        jmCadastros.add(jmProdutos);

        jmiTipoMovimento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
        jmiTipoMovimento.setText("Tipo de Movimento");
        jmiTipoMovimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTipoMovimentoActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiTipoMovimento);

        jmiSituacoes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        jmiSituacoes.setText("Situações");
        jmiSituacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSituacoesActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiSituacoes);
        jmCadastros.add(jSeparator1);

        jmSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jmSair.setText("Sair");
        jmSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSairActionPerformed(evt);
            }
        });
        jmCadastros.add(jmSair);

        barra_menus.add(jmCadastros);

        jmMovimentos.setText("Movimentos");

        jmCompra.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        jmCompra.setText("Compra");
        jmMovimentos.add(jmCompra);

        jmVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        jmVenda.setText("Venda");
        jmMovimentos.add(jmVenda);

        barra_menus.add(jmMovimentos);

        jmRelatorios.setText("Relatórios");

        jmiRelCategorias.setText("Categorias");
        jmiRelCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRelCategoriasActionPerformed(evt);
            }
        });
        jmRelatorios.add(jmiRelCategorias);

        jmiRelModulos.setText("Módulos");
        jmiRelModulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRelModulosActionPerformed(evt);
            }
        });
        jmRelatorios.add(jmiRelModulos);

        barra_menus.add(jmRelatorios);

        setJMenuBar(barra_menus);

        setSize(new java.awt.Dimension(814, 709));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmSairActionPerformed

    private void jmPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPessoasActionPerformed
        if (!verificaFrame(objForn)) {
            objForn = new jifPessoas();
            jdpPrincipal.add(objForn);
            objForn.setVisible(true);
        } else {
            jdpPrincipal.setComponentZOrder(objForn, 0);
        }
    }//GEN-LAST:event_jmPessoasActionPerformed

    private void jmProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProdutosActionPerformed
        if (!verificaFrame(objProd)) {
            objProd = new jifProdutos();
            jdpPrincipal.add(objProd);
            objProd.setVisible(true);
        } else {
            jdpPrincipal.setComponentZOrder(objProd, 0);
        }
    }//GEN-LAST:event_jmProdutosActionPerformed

    private void jmiRelCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRelCategoriasActionPerformed
        try {

            JasperReport relatorio = (JasperReport) JRLoader.
                    loadObject("E:\\Livro Java\\GIT2\\ProjetoLivro\\ProjetoVendasDesktop\\src\\br\\pro\\luciene\\ProjetoVendas\\relatorios\\categorias2.jasper");
            JasperPrint impressao = JasperFillManager.fillReport(relatorio,
                    null, con.getConexao());
            JasperViewer visualizador = new JasperViewer(impressao, false);
            visualizador.setVisible(true);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "deu erro =" + erro);
        }
    }//GEN-LAST:event_jmiRelCategoriasActionPerformed

    private void jmiTipoMovimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTipoMovimentoActionPerformed
        jifTipoMovimento janela = new jifTipoMovimento();
        jdpPrincipal.add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_jmiTipoMovimentoActionPerformed

    private void jmiSituacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSituacoesActionPerformed
        jifSituacoes janela = new jifSituacoes();
        jdpPrincipal.add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_jmiSituacoesActionPerformed

    private void jifFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jifFuncionariosActionPerformed
        jifFuncionarios janela = new jifFuncionarios();
        jdpPrincipal.add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_jifFuncionariosActionPerformed

    private void jmiRelModulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRelModulosActionPerformed
        try {

            JasperReport relatorio = (JasperReport) JRLoader.
                    loadObject("E:\\Livro Java\\GIT2\\ProjetoLivro\\ProjetoVendasDesktop\\src\\br\\pro\\luciene\\ProjetoVendas\\relatorios\\relModulos.jasper");
            JasperPrint impressao = JasperFillManager.fillReport(relatorio,
                    null, con.getConexao());
            JasperViewer visualizador = new JasperViewer(impressao, false);
            visualizador.setVisible(true);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "deu erro =" + erro);
        }
    }//GEN-LAST:event_jmiRelModulosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barra_menus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JDesktopPane jdpPrincipal;
    private javax.swing.JMenuItem jifFuncionarios;
    private javax.swing.JLabel jlData;
    private javax.swing.JLabel jlHora;
    private javax.swing.JLabel jldesenvolvimento;
    private javax.swing.JMenu jmCadastros;
    private javax.swing.JMenuItem jmCompra;
    private static javax.swing.JMenu jmMovimentos;
    private static javax.swing.JMenuItem jmPessoas;
    private javax.swing.JMenuItem jmProdutos;
    private javax.swing.JMenu jmRelatorios;
    private javax.swing.JMenuItem jmSair;
    private javax.swing.JMenuItem jmVenda;
    private javax.swing.JMenuItem jmiRelCategorias;
    private javax.swing.JMenuItem jmiRelModulos;
    private javax.swing.JMenuItem jmiSituacoes;
    private javax.swing.JMenuItem jmiTipoMovimento;
    // End of variables declaration//GEN-END:variables

    public boolean verificaFrame(JInternalFrame frame) { //construtor recebe o JDesktopPane e o JInternalFrame que deseja verififcar
        boolean valor = false;
        JInternalFrame[] results;
        results = jdpPrincipal.getAllFrames(); // Retorna todos os frames em um vetor
        for (int i = 0; i < results.length; i++) {
            if (results[i].equals(frame)) {  //se o frame pesquisado estiver na tela, retornar true
                valor = true;
                break;
            }
        }
        return valor;
    }

    public static void login(String usuario) {
        JOptionPane.showMessageDialog(null, "Teste");
        if (usuario.equals("fatec")) {
            jmPessoas.setEnabled(false);
        }
        if (usuario.equals("phila")) {
            jmMovimentos.setEnabled(false);
        }
    }

}
