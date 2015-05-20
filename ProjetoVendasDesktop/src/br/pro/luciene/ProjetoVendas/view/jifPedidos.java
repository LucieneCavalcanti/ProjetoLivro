/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * jifPedidos.java
 *
 * Created on 29/01/2011, 15:21:59
 */

package br.pro.luciene.ProjetoVendas.view;

/**
 *
 * @author Luciene
 */
public class jifPedidos extends javax.swing.JInternalFrame {

    /** Creates new form jifPedidos */
    public jifPedidos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlCodigo = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jlData = new javax.swing.JLabel();
        jdcData = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox();
        jlCodigo1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jlCodigo2 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jlCodigo3 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jlCodigo4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox5 = new javax.swing.JComboBox();
        jlCodigo6 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jlCodigo5 = new javax.swing.JLabel();
        jlCodigo7 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jlCodigo8 = new javax.swing.JLabel();
        jbAdicionar = new javax.swing.JButton();
        jbRetirar = new javax.swing.JButton();
        jbConsultar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setTitle("Pedidos");
        getContentPane().setLayout(null);

        jlCodigo.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlCodigo.setText("Cliente:");
        getContentPane().add(jlCodigo);
        jlCodigo.setBounds(40, 60, 70, 17);

        jtCodigo.setEditable(false);
        jtCodigo.setForeground(new java.awt.Color(0, 0, 204));
        jtCodigo.setToolTipText("Digite o código");
        jtCodigo.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, new java.awt.Color(0, 102, 102)));
        getContentPane().add(jtCodigo);
        jtCodigo.setBounds(120, 20, 50, 20);

        jlData.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlData.setText("Data:");
        getContentPane().add(jlData);
        jlData.setBounds(210, 20, 27, 14);

        jdcData.setEnabled(false);
        getContentPane().add(jdcData);
        jdcData.setBounds(250, 20, 120, 20);

        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(120, 60, 160, 20);

        jlCodigo1.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlCodigo1.setText("Código:");
        getContentPane().add(jlCodigo1);
        jlCodigo1.setBounds(40, 20, 70, 17);

        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(400, 60, 160, 20);

        jlCodigo2.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlCodigo2.setText("Vendedor:");
        getContentPane().add(jlCodigo2);
        jlCodigo2.setBounds(320, 60, 70, 17);

        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(190, 100, 160, 20);

        jlCodigo3.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlCodigo3.setText("Forma de Pagamento:");
        getContentPane().add(jlCodigo3);
        jlCodigo3.setBounds(40, 100, 170, 17);

        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(430, 100, 160, 20);

        jlCodigo4.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlCodigo4.setText("Status:");
        getContentPane().add(jlCodigo4);
        jlCodigo4.setBounds(360, 100, 70, 17);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Quantidade", "Preço Unitário", "Preço Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 570, 150);

        jPanel1.add(jComboBox5);
        jComboBox5.setBounds(20, 30, 160, 20);

        jlCodigo6.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlCodigo6.setText("Produto:");
        jPanel1.add(jlCodigo6);
        jlCodigo6.setBounds(20, 10, 80, 17);
        jPanel1.add(jFormattedTextField1);
        jFormattedTextField1.setBounds(210, 30, 80, 20);

        jlCodigo5.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlCodigo5.setText("Quantidade");
        jPanel1.add(jlCodigo5);
        jlCodigo5.setBounds(210, 10, 80, 17);

        jlCodigo7.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlCodigo7.setText("Preço Unitário");
        jPanel1.add(jlCodigo7);
        jlCodigo7.setBounds(310, 10, 100, 17);
        jPanel1.add(jFormattedTextField2);
        jFormattedTextField2.setBounds(310, 30, 100, 20);
        jPanel1.add(jFormattedTextField3);
        jFormattedTextField3.setBounds(420, 30, 100, 20);

        jlCodigo8.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlCodigo8.setText("Preço Total");
        jPanel1.add(jlCodigo8);
        jlCodigo8.setBounds(420, 10, 80, 17);

        jbAdicionar.setText("+");
        jbAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionarActionPerformed(evt);
            }
        });
        jPanel1.add(jbAdicionar);
        jbAdicionar.setBounds(540, 10, 40, 23);

        jbRetirar.setText("-");
        jbRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRetirarActionPerformed(evt);
            }
        });
        jPanel1.add(jbRetirar);
        jbRetirar.setBounds(540, 40, 40, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 140, 600, 250);

        jbConsultar.setText("Consultar");
        jbConsultar.setEnabled(false);
        getContentPane().add(jbConsultar);
        jbConsultar.setBounds(340, 500, 120, 23);

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
        jbSalvar.setBounds(100, 470, 120, 23);

        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jbCancelar);
        jbCancelar.setBounds(220, 470, 120, 23);

        jbExcluir.setText("Excluir");
        jbExcluir.setEnabled(false);
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jbExcluir);
        jbExcluir.setBounds(340, 470, 120, 23);

        jbAlterar.setText("Alterar");
        jbAlterar.setEnabled(false);
        getContentPane().add(jbAlterar);
        jbAlterar.setBounds(220, 500, 120, 23);

        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });
        getContentPane().add(jbSair);
        jbSair.setBounds(460, 500, 110, 23);

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jbNovo);
        jbNovo.setBounds(100, 500, 120, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Total:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(430, 410, 100, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Desconto:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 410, 100, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Subtotal:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 410, 100, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRetirarActionPerformed
//        DefaultTableModel mp = (DefaultTableModel) tabela.getModel();
//        mp.removeRow(tabela.getSelectedRow());
//        tabela.setModel(mp);
}//GEN-LAST:event_jbRetirarActionPerformed

    private void jbAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionarActionPerformed
//        DefaultTableModel mp = (DefaultTableModel) tabela.getModel();
//        mp.addRow(new String[]{jcTipo.getSelectedItem().toString(),
//        jtDDD.getText(),
//        jtTelefone.getText()});
}//GEN-LAST:event_jbAdicionarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
//        if(validar_campos()){
//            limpar_campos();
//            desabilitar_campos();
//            jbNovo.setEnabled(true);
//            jbSalvar.setEnabled(false);
//            jbCancelar.setEnabled(false);
//            JOptionPane.showMessageDialog(this,
//                    "Registro Salvo com Sucesso!",
//                    "Mensagem", JOptionPane.INFORMATION_MESSAGE);
//        }
}//GEN-LAST:event_jbSalvarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
//        limpar_campos();
//        desabilitar_campos();
        jbSalvar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbNovo.setEnabled(true);// TODO add your handling code here:
}//GEN-LAST:event_jbCancelarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jbExcluirActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        dispose();
}//GEN-LAST:event_jbSairActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
     //   habilitar_campos();
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbNovo.setEnabled(false);
        jdcData.getDate().toString();
}//GEN-LAST:event_jbNovoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbAdicionar;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbRetirar;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSalvar;
    private com.toedter.calendar.JDateChooser jdcData;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlCodigo1;
    private javax.swing.JLabel jlCodigo2;
    private javax.swing.JLabel jlCodigo3;
    private javax.swing.JLabel jlCodigo4;
    private javax.swing.JLabel jlCodigo5;
    private javax.swing.JLabel jlCodigo6;
    private javax.swing.JLabel jlCodigo7;
    private javax.swing.JLabel jlCodigo8;
    private javax.swing.JLabel jlData;
    private javax.swing.JTextField jtCodigo;
    // End of variables declaration//GEN-END:variables

}
