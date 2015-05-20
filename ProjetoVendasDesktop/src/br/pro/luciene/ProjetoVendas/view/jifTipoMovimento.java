/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.pro.luciene.ProjetoVendas.view;

import br.pro.luciene.ProjetoVendas.model.TipoMovimento;
import javax.swing.JOptionPane;

/**
 *
 * @author Luciene
 */
public class jifTipoMovimento extends javax.swing.JInternalFrame {
    TipoMovimento obj;
    /**
     * Creates new form jifTipoMovimento
     */
    public jifTipoMovimento() {
        initComponents();
        obj = new TipoMovimento();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlId = new javax.swing.JLabel();
        jlIdTipoMovimento = new javax.swing.JLabel();
        jlDescricao = new javax.swing.JLabel();
        jtDescricao = new javax.swing.JTextField();
        jlTipoLancamento = new javax.swing.JLabel();
        jcbTipoLancamento = new javax.swing.JComboBox();
        jbNovo = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Movimentos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlId.setText("id");
        getContentPane().add(jlId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jlIdTipoMovimento.setText("0");
        getContentPane().add(jlIdTipoMovimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jlDescricao.setText("Descrição");
        getContentPane().add(jlDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        jtDescricao.setEnabled(false);
        getContentPane().add(jtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 337, -1));

        jlTipoLancamento.setText("Tipo de Lançamento");
        getContentPane().add(jlTipoLancamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jcbTipoLancamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Selecione>", "Entrada", "Saída" }));
        jcbTipoLancamento.setEnabled(false);
        getContentPane().add(jcbTipoLancamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 197, -1));

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jbNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 100, -1));

        jbSalvar.setText("Salvar");
        jbSalvar.setEnabled(false);
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 110, -1));

        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jbCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 100, -1));

        jbEditar.setText("Editar");
        jbEditar.setEnabled(false);
        getContentPane().add(jbEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 110, -1));

        jbExcluir.setText("Excluir");
        jbExcluir.setEnabled(false);
        getContentPane().add(jbExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 120, -1));

        setBounds(0, 0, 601, 240);
    }// </editor-fold>//GEN-END:initComponents

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        limparCampos();
        tratarCampos(true);
        jbNovo.setEnabled(false);
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        limparCampos();
        tratarCampos(false);
        jbNovo.setEnabled(true);
        jbSalvar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
       try {
            if(validarCampos()){
                if(preencherObjeto()){
                    //if(DAO.incluir(obj)){
                        JOptionPane.showMessageDialog(this, "Salvo com sucesso",
                                "Salvar",JOptionPane.INFORMATION_MESSAGE);
                        jbCancelarActionPerformed(evt);
//                    } else {
//                        JOptionPane.showMessageDialog(this, "Não foi possível salvar",
//                                "Salvar",JOptionPane.ERROR_MESSAGE);
//                    }
                }
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Erro: "
                    + erro.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox jcbTipoLancamento;
    private javax.swing.JLabel jlDescricao;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlIdTipoMovimento;
    private javax.swing.JLabel jlTipoLancamento;
    private javax.swing.JTextField jtDescricao;
    // End of variables declaration//GEN-END:variables
private void limparCampos(){
    jlIdTipoMovimento.setText("0");
    jtDescricao.setText("");
    jcbTipoLancamento.setSelectedIndex(0);
}
private void tratarCampos(boolean b){
    jtDescricao.setEnabled(b);
    jcbTipoLancamento.setEnabled(b);
}
private boolean validarCampos(){
    if(jtDescricao.getText().equals("")){
        JOptionPane.showMessageDialog(this, "Digite a descrição");
        jtDescricao.requestFocus();
        return false;
    }
    if(jcbTipoLancamento.getSelectedIndex()==0){
        JOptionPane.showMessageDialog(this, "Selecione o Tipo de Lançamento");
        jcbTipoLancamento.requestFocus();
        return false;
    }
    return true;
}
private boolean preencherObjeto() throws Exception{
    obj.setIdTipo(Integer.parseInt(jlIdTipoMovimento.getText()));
    obj.setDescricao(jtDescricao.getText());
    obj.setTipoLancamento(jcbTipoLancamento.getSelectedIndex());
    return true;
}

}