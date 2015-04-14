/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * jifProdutos.java
 *
 * Created on 31/03/2009, 20:59:44
 */

package br.edu.fatecriopreto.loja.view;

import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import br.edu.fatecriopreto.loja.model.Categoria;
import br.edu.fatecriopreto.loja.model.Produto;
import br.edu.fatecriopreto.loja.data.CategoriaData;
import br.edu.fatecriopreto.loja.data.ProdutoDAO;

/**
 *
 * @author Alunos
 */
public class jifProdutos extends javax.swing.JInternalFrame {
    Produto objProd;
//    ProdutoDAO DAO = new ProdutoDAO();
    CategoriaData CategoriaDAO = new CategoriaData();
    Vector <Categoria> categoria;
    int acao = 0;

    /** Creates new form jifProdutos */
    public jifProdutos() {
        initComponents();
        jc_Categoria.setEnabled(false);     
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
        jbPesquisar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jlCodigo = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jlCategoria = new javax.swing.JLabel();
        jlTelefones = new javax.swing.JLabel();
        jlContato = new javax.swing.JLabel();
        jftQtde = new javax.swing.JFormattedTextField();
        br.edu.fatecriopreto.loja.extras.FormatarCampos.mascara_numero(jftQtde);
        jftPrecoCusto = new javax.swing.JFormattedTextField();
        jtDescricao = new javax.swing.JTextField();
        jbSair = new javax.swing.JButton();
        jc_Categoria = new javax.swing.JComboBox();
        jlQtde = new javax.swing.JLabel();
        jlImagem = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Produtos");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jtCodigo.setToolTipText("Digite o código");
        getContentPane().add(jtCodigo);
        jtCodigo.setBounds(120, 40, 90, 20);

        jftPrecoVenda.setEditable(false);
        jftPrecoVenda.setToolTipText("Digite o preço de venda");
        jftPrecoVenda = new br.edu.fatecriopreto.loja.extras.JMoneyField();
        getContentPane().add(jftPrecoVenda);
        jftPrecoVenda.setBounds(170, 190, 90, 20);

        jbConsultar.setText("Consultar");
        jbConsultar.setEnabled(false);
        jbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(jbConsultar);
        jbConsultar.setBounds(270, 250, 120, 23);

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
        jbSalvar.setBounds(30, 220, 120, 23);

        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jbCancelar);
        jbCancelar.setBounds(150, 220, 120, 23);

        jbExcluir.setText("Excluir");
        jbExcluir.setEnabled(false);
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jbExcluir);
        jbExcluir.setBounds(270, 220, 120, 23);

        jbAlterar.setText("Alterar");
        jbAlterar.setEnabled(false);
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(jbAlterar);
        jbAlterar.setBounds(150, 250, 120, 23);

        jbPesquisar.setText("Pesquisar");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jbPesquisar);
        jbPesquisar.setBounds(230, 40, 110, 23);

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jbNovo);
        jbNovo.setBounds(30, 250, 120, 23);

        jlCodigo.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlCodigo.setText("Código:");
        getContentPane().add(jlCodigo);
        jlCodigo.setBounds(50, 40, 70, 17);

        jlNome.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlNome.setText("Descrição:");
        getContentPane().add(jlNome);
        jlNome.setBounds(50, 70, 70, 17);

        jlCategoria.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlCategoria.setText("Categoria:");
        getContentPane().add(jlCategoria);
        jlCategoria.setBounds(50, 100, 70, 17);

        jlTelefones.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlTelefones.setText("Preço de Custo:");
        getContentPane().add(jlTelefones);
        jlTelefones.setBounds(50, 160, 120, 17);

        jlContato.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlContato.setText("Preço de Venda:");
        getContentPane().add(jlContato);
        jlContato.setBounds(50, 190, 120, 17);

        jftQtde.setEditable(false);
        jftQtde.setToolTipText("Digite a quantidade");
        getContentPane().add(jftQtde);
        jftQtde.setBounds(120, 130, 140, 20);

        jftPrecoCusto.setEditable(false);
        jftPrecoCusto.setToolTipText("Digite o preço de custo");
        jftPrecoCusto = new br.edu.fatecriopreto.loja.extras.JMoneyField();
        getContentPane().add(jftPrecoCusto);
        jftPrecoCusto.setBounds(170, 160, 90, 20);

        jtDescricao.setEditable(false);
        jtDescricao.setToolTipText("Digite a descrição");
        getContentPane().add(jtDescricao);
        jtDescricao.setBounds(130, 70, 280, 20);

        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });
        getContentPane().add(jbSair);
        jbSair.setBounds(390, 250, 110, 23);

        jc_Categoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<selecione>", "Limpeza", "Bebidas" }));
        getContentPane().add(jc_Categoria);
        jc_Categoria.setBounds(130, 100, 280, 20);

        jlQtde.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlQtde.setText("Qtde:");
        getContentPane().add(jlQtde);
        jlQtde.setBounds(50, 130, 70, 17);

        jlImagem.setText("Imagem");
        jlImagem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jlImagem);
        jlImagem.setBounds(444, 10, 80, 110);

        setBounds(0, 0, 568, 327);
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
    boolean ok = false;
    try {
        if(br.edu.fatecriopreto.loja.extras.Validacao.validar_campos(this)){
            if (preencher_objeto()){
                if (acao == 1)
               //     ok = DAO.Inclui(objProd);
                if (acao == 2)
                //    ok = DAO.Altera(objProd);

                if (ok) {
                    br.edu.fatecriopreto.loja.extras.Validacao.limpar_campos(this);
                    br.edu.fatecriopreto.loja.extras.Validacao.desabilitar_campos(this);
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
        br.edu.fatecriopreto.loja.extras.Validacao.limpar_campos(this);
        br.edu.fatecriopreto.loja.extras.Validacao.desabilitar_campos(this);
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

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
    try{
    //   objProd = DAO.Obtem(Integer.parseInt(jtCodigo.getText()));
       if (objProd == null){
           JOptionPane.showMessageDialog(this, "Registro não encontrado.");
       }
       else {
           jtDescricao.setText(objProd.getDescricao());
           jftQtde.setText(String.valueOf(objProd.getQuantidade()));
           jftPrecoCusto.setText(String.valueOf(objProd.getPreco_custo()));
           jftPrecoVenda.setText(String.valueOf(objProd.getPreco_venda()));
           jc_Categoria.setSelectedItem(objProd.getCategoria().getDescricao().trim());
     //      jdcData.setDate(objProd.getData());
           jtCodigo.setEditable(false);
           jbAlterar.setEnabled(true);
           jbNovo.setEnabled(false);
           jbCancelar.setEnabled(true);
       }
    }
    catch(Exception erro) {
       JOptionPane.showMessageDialog(this, "Ocorreu um erro: " + erro.getMessage());
    }

}//GEN-LAST:event_jbPesquisarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        acao = 1;
        br.edu.fatecriopreto.loja.extras.Validacao.habilitar_campos(this);
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbNovo.setEnabled(false);
        jc_Categoria.setEnabled(true);
}//GEN-LAST:event_jbNovoActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        dispose();
}//GEN-LAST:event_jbSairActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try{
        categoria = new Vector <Categoria>();
        categoria = CategoriaDAO.CarregaCombo();
        jc_Categoria.setModel(new DefaultComboBoxModel
                (categoria));
        }
        catch(Exception erro){
            JOptionPane.showMessageDialog(this, "Ocorreu um erro: " + erro.getMessage());
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
    acao = 2;        // TODO add your handling code here:
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbConsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox jc_Categoria;
    private javax.swing.JFormattedTextField jftPrecoCusto;
    private javax.swing.JFormattedTextField jftPrecoVenda;
    private javax.swing.JFormattedTextField jftQtde;
    private javax.swing.JLabel jlCategoria;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlContato;
    private javax.swing.JLabel jlImagem;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlQtde;
    private javax.swing.JLabel jlTelefones;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtDescricao;
    // End of variables declaration//GEN-END:variables

    public boolean preencher_objeto() throws Exception{
         objProd = new Produto();
         objProd.setCodigo(Integer.parseInt(jtCodigo.getText()));
         objProd.setDescricao(jtDescricao.getText());
         objProd.setPreco_custo(Float.parseFloat(jftPrecoCusto.getText().replace(",", ".")));
         objProd.setPreco_venda(Float.parseFloat(jftPrecoVenda.getText().replace(",", ".")));
         objProd.setQuantidade(Integer.parseInt(jftQtde.getText().trim()));
  //       objProd.setData(jdcData.getDate());
         //objProd.setCategoria(CategoriaDAO.BuscarChave(jc_Categoria.getSelectedItem().toString()));
         objProd.setCategoria(categoria.get(jc_Categoria.getSelectedIndex()));
         
         return true;
    }
    private boolean validarCampos(){
        if (jtCodigo.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Preencha o campo código", 
                    "Validação", JOptionPane.INFORMATION_MESSAGE);
            jtCodigo.requestFocus();
            return false;
        }
        if(jc_Categoria.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Selecione o campo categoria", 
                    "Validação", JOptionPane.INFORMATION_MESSAGE);
            jc_Categoria.requestFocus();
            return false;
        }
        return true;
    }
}
