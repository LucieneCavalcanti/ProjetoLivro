/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * jifProdutos.java
 *
 * Created on 31/03/2009, 20:59:44
 */

package br.pro.luciene.ProjetoVendas.view;

import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import br.pro.luciene.ProjetoVendas.model.Categoria;
import br.pro.luciene.ProjetoVendas.model.Produto;
import br.pro.luciene.ProjetoVendas.data.CategoriaData;
import br.pro.luciene.ProjetoVendas.data.ProdutoData;

/**
 *
 * @author Alunos
 */
public class jifProdutos extends javax.swing.JInternalFrame {
    Produto obj;
//    ProdutoDAO DAO = new ProdutoDAO();
    ProdutoData DAO;
    Vector <Categoria> vetorCategorias;
    int acao = 0;

    /** Creates new form jifProdutos */
    public jifProdutos() {
        initComponents();
        try {
            obj = new Produto();
            DAO = new ProdutoData();
            vetorCategorias = CategoriaData.carregarCombo();
            jcbCategoria.setModel(new DefaultComboBoxModel(vetorCategorias));
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Erro: "
                    + erro.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }    
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtCodigo = new javax.swing.JTextField();
        jftPrecoVenda = new javax.swing.JFormattedTextField();
        jbConsultar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jlCodigo = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jlCategoria = new javax.swing.JLabel();
        jlContato = new javax.swing.JLabel();
        jtDescricao = new javax.swing.JTextField();
        jcbCategoria = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Produtos");
        getContentPane().setLayout(null);

        jtCodigo.setToolTipText("Digite o código");
        getContentPane().add(jtCodigo);
        jtCodigo.setBounds(120, 40, 90, 20);

        jftPrecoVenda.setEditable(false);
        jftPrecoVenda.setToolTipText("Digite o preço de venda");
        jftPrecoVenda = new br.pro.luciene.ProjetoVendas.extras.JMoneyField();
        getContentPane().add(jftPrecoVenda);
        jftPrecoVenda.setBounds(170, 130, 90, 20);

        jbConsultar.setText("Consultar");
        jbConsultar.setEnabled(false);
        jbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(jbConsultar);
        jbConsultar.setBounds(290, 230, 120, 23);

        jbSalvar.setText("Salvar");
        jbSalvar.setEnabled(false);
        jbSalvar.setMaximumSize(new java.awt.Dimension(75, 23));
        jbSalvar.setMinimumSize(new java.awt.Dimension(75, 23));
        jbSalvar.setPreferredSize(new java.awt.Dimension(75, 23));
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalvar);
        jbSalvar.setBounds(50, 200, 120, 23);

        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jbCancelar);
        jbCancelar.setBounds(170, 200, 120, 23);

        jbExcluir.setText("Excluir");
        jbExcluir.setEnabled(false);
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jbExcluir);
        jbExcluir.setBounds(290, 200, 120, 23);

        jbAlterar.setText("Alterar");
        jbAlterar.setEnabled(false);
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(jbAlterar);
        jbAlterar.setBounds(170, 230, 120, 23);

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jbNovo);
        jbNovo.setBounds(50, 230, 120, 23);

        jlCodigo.setText("Código");
        getContentPane().add(jlCodigo);
        jlCodigo.setBounds(50, 40, 70, 14);

        jlNome.setText("Descrição");
        getContentPane().add(jlNome);
        jlNome.setBounds(50, 70, 70, 14);

        jlCategoria.setText("Categoria");
        getContentPane().add(jlCategoria);
        jlCategoria.setBounds(50, 100, 70, 14);

        jlContato.setText("Preço de Venda");
        getContentPane().add(jlContato);
        jlContato.setBounds(50, 130, 120, 14);

        jtDescricao.setEditable(false);
        jtDescricao.setToolTipText("Digite a descrição");
        getContentPane().add(jtDescricao);
        jtDescricao.setBounds(130, 70, 280, 20);

        jcbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<selecione>", "Limpeza", "Bebidas" }));
        getContentPane().add(jcbCategoria);
        jcbCategoria.setBounds(130, 100, 280, 20);

        jLabel1.setText("Qtde Mínima");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 170, 70, 14);

        jLabel2.setText("0");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 170, 40, 14);

        jLabel3.setText("Qtde Atual");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 170, 70, 14);

        jLabel4.setText("0");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(270, 170, 34, 14);

        setBounds(0, 0, 489, 327);
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
    boolean ok = false;
    try {
        if(br.pro.luciene.ProjetoVendas.extras.Validacao.validarCampos(this)){
            if (preencherObjeto()){
                if (acao == 1)
               //     ok = DAO.Inclui(objProd);
                if (acao == 2)
                //    ok = DAO.Altera(objProd);

                if (ok) {
                    br.pro.luciene.ProjetoVendas.extras.Validacao.limparCampos(this);
                    br.pro.luciene.ProjetoVendas.extras.Validacao.tratarCampos(this,false);
                    jbNovo.setEnabled(true);
                    jbSalvar.setEnabled(false);
                    jbCancelar.setEnabled(false);
                    JOptionPane.showMessageDialog(this,
                        "Registro Salvo com Sucesso!",
                        "Mensagem", JOptionPane.INFORMATION_MESSAGE); }
                 else {
                        JOptionPane.showMessageDialog(this,
                        "Ocorreu um problema ao inserir o registro.",
                        "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    }
            }
        }
     }
     catch(Exception erro) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro: " + erro.getMessage());
        }
}//GEN-LAST:event_jbSalvarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        br.pro.luciene.ProjetoVendas.extras.Validacao.limparCampos(this);
        br.pro.luciene.ProjetoVendas.extras.Validacao.tratarCampos(this,false);
        jbSalvar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbNovo.setEnabled(true);// TODO add your handling code here:
}//GEN-LAST:event_jbCancelarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
     try{
//        if (DAO.Exclui(Integer.parseInt(jtCodigo.getText()))){
//            JOptionPane.showMessageDialog(this, "Registro excluído com sucesso !");
//            br.edu.fatecriopreto.loja.extras.validacao.limpar_campos(this);
//            br.edu.fatecriopreto.loja.extras.validacao.desabilitar_campos(this);
//        }
//        else{
//            JOptionPane.showMessageDialog(this, "Ocorreu um erro ao excluir o registro ");
//        }
     }
     catch(Exception erro) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro: " + erro.getMessage());
        }
}//GEN-LAST:event_jbExcluirActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        acao = 1;
        br.pro.luciene.ProjetoVendas.extras.Validacao.tratarCampos(this,true);
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbNovo.setEnabled(false);
        jcbCategoria.setEnabled(true);
}//GEN-LAST:event_jbNovoActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
    acao = 2;        // TODO add your handling code here:
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbConsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox jcbCategoria;
    private javax.swing.JFormattedTextField jftPrecoVenda;
    private javax.swing.JLabel jlCategoria;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlContato;
    private javax.swing.JLabel jlNome;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtDescricao;
    // End of variables declaration//GEN-END:variables

    public boolean preencherObjeto() throws Exception{
         obj.setIdProduto(Integer.parseInt(jtCodigo.getText()));
         obj.setDescricao(jtDescricao.getText());
         obj.setPreco(Float.parseFloat(jftPrecoVenda.getText().replace(",", ".")));
         obj.setCategoria(vetorCategorias.get(jcbCategoria.getSelectedIndex()));
         //estoque ?
         return true;
    }
    private boolean validarCampos(){
        if (jtCodigo.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Preencha o campo código", 
                    "Validação", JOptionPane.INFORMATION_MESSAGE);
            jtCodigo.requestFocus();
            return false;
        }
        if(jcbCategoria.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Selecione o campo categoria", 
                    "Validação", JOptionPane.INFORMATION_MESSAGE);
            jcbCategoria.requestFocus();
            return false;
        }
        return true;
    }
}
