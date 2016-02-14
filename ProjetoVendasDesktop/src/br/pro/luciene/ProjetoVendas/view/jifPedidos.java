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

        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jlTotalPedido = new javax.swing.JLabel();
        jlDesconto = new javax.swing.JLabel();
        jlSubtototal = new javax.swing.JLabel();
        jftDesconto = new javax.swing.JFormattedTextField();
        jtpPainel = new javax.swing.JTabbedPane();
        jpDadosPedido = new javax.swing.JPanel();
        jlId2 = new javax.swing.JLabel();
        jcbTipoMovimento = new javax.swing.JComboBox();
        jcbFuncionario = new javax.swing.JComboBox();
        jlTipoMovimento = new javax.swing.JLabel();
        jlSituacao = new javax.swing.JLabel();
        jdcData = new com.toedter.calendar.JDateChooser();
        jtComissao = new javax.swing.JTextField();
        jlData = new javax.swing.JLabel();
        jcbCliente = new javax.swing.JComboBox();
        jlCliente = new javax.swing.JLabel();
        jcbSituacao = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jcbProduto = new javax.swing.JComboBox();
        jlProduto = new javax.swing.JLabel();
        jftQuantidade = new javax.swing.JFormattedTextField();
        jlQuantidade = new javax.swing.JLabel();
        jlPrecoUnitario = new javax.swing.JLabel();
        jftPrecoUnitario = new javax.swing.JFormattedTextField();
        jftPrecoTotal = new javax.swing.JFormattedTextField();
        jlPrecoTotal = new javax.swing.JLabel();
        jbAdicionar = new javax.swing.JButton();
        jbRetirar = new javax.swing.JButton();
        jlFuncionario = new javax.swing.JLabel();
        jlId = new javax.swing.JLabel();
        jlComissao = new javax.swing.JLabel();
        jpPesquisa = new javax.swing.JPanel();
        jcbCampoPesquisa = new javax.swing.JComboBox();
        jlCampo = new javax.swing.JLabel();
        jtPesquisa = new javax.swing.JTextField();
        jlPesquisa = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbPesquisa = new javax.swing.JTable();

        setClosable(true);
        setTitle("Pedidos");
        getContentPane().setLayout(null);

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
        jbSalvar.setBounds(280, 480, 120, 23);

        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jbCancelar);
        jbCancelar.setBounds(400, 480, 120, 23);

        jbExcluir.setText("Excluir");
        jbExcluir.setEnabled(false);
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jbExcluir);
        jbExcluir.setBounds(360, 510, 120, 23);

        jbEditar.setText("Editar");
        jbEditar.setEnabled(false);
        getContentPane().add(jbEditar);
        jbEditar.setBounds(240, 510, 120, 23);

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jbNovo);
        jbNovo.setBounds(160, 480, 120, 23);

        jlTotalPedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlTotalPedido.setText("Total:");
        getContentPane().add(jlTotalPedido);
        jlTotalPedido.setBounds(480, 420, 100, 40);

        jlDesconto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlDesconto.setText("Desconto:");
        getContentPane().add(jlDesconto);
        jlDesconto.setBounds(240, 420, 100, 40);

        jlSubtototal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlSubtototal.setText("Subtotal:");
        getContentPane().add(jlSubtototal);
        jlSubtototal.setBounds(40, 420, 70, 40);

        jftDesconto.setEditable(false);
        getContentPane().add(jftDesconto);
        jftDesconto.setBounds(340, 430, 110, 20);

        jpDadosPedido.setLayout(null);

        jlId2.setText("0");
        jpDadosPedido.add(jlId2);
        jlId2.setBounds(70, 20, 60, 14);

        jcbTipoMovimento.setEnabled(false);
        jpDadosPedido.add(jcbTipoMovimento);
        jcbTipoMovimento.setBounds(170, 80, 160, 20);

        jcbFuncionario.setToolTipText("Selecione o Funcionário");
        jcbFuncionario.setEnabled(false);
        jpDadosPedido.add(jcbFuncionario);
        jcbFuncionario.setBounds(140, 50, 160, 20);

        jlTipoMovimento.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlTipoMovimento.setText("Tipo Movimento:");
        jpDadosPedido.add(jlTipoMovimento);
        jlTipoMovimento.setBounds(20, 80, 170, 17);

        jlSituacao.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlSituacao.setText("Situação:");
        jpDadosPedido.add(jlSituacao);
        jlSituacao.setBounds(350, 80, 70, 17);

        jdcData.setEnabled(false);
        jpDadosPedido.add(jdcData);
        jdcData.setBounds(250, 20, 120, 20);

        jtComissao.setEditable(false);
        jpDadosPedido.add(jtComissao);
        jtComissao.setBounds(400, 50, 90, 20);

        jlData.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlData.setText("Data:");
        jpDadosPedido.add(jlData);
        jlData.setBounds(210, 20, 27, 14);

        jcbCliente.setEnabled(false);
        jpDadosPedido.add(jcbCliente);
        jcbCliente.setBounds(470, 20, 160, 20);

        jlCliente.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlCliente.setText("Cliente:");
        jpDadosPedido.add(jlCliente);
        jlCliente.setBounds(390, 20, 70, 17);

        jcbSituacao.setEnabled(false);
        jpDadosPedido.add(jcbSituacao);
        jcbSituacao.setBounds(420, 80, 160, 20);

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
        jScrollPane1.setBounds(10, 80, 570, 120);

        jcbProduto.setEnabled(false);
        jcbProduto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbProdutoItemStateChanged(evt);
            }
        });
        jPanel1.add(jcbProduto);
        jcbProduto.setBounds(20, 30, 160, 20);

        jlProduto.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlProduto.setText("Produto:");
        jPanel1.add(jlProduto);
        jlProduto.setBounds(20, 10, 80, 17);

        jftQuantidade.setEditable(false);
        jPanel1.add(jftQuantidade);
        jftQuantidade.setBounds(210, 30, 80, 20);

        jlQuantidade.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlQuantidade.setText("Quantidade");
        jPanel1.add(jlQuantidade);
        jlQuantidade.setBounds(210, 10, 80, 17);

        jlPrecoUnitario.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlPrecoUnitario.setText("Preço Unitário");
        jPanel1.add(jlPrecoUnitario);
        jlPrecoUnitario.setBounds(310, 10, 100, 17);

        jftPrecoUnitario.setEditable(false);
        jPanel1.add(jftPrecoUnitario);
        jftPrecoUnitario.setBounds(310, 30, 100, 20);

        jftPrecoTotal.setEditable(false);
        jPanel1.add(jftPrecoTotal);
        jftPrecoTotal.setBounds(420, 30, 100, 20);

        jlPrecoTotal.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlPrecoTotal.setText("Preço Total");
        jPanel1.add(jlPrecoTotal);
        jlPrecoTotal.setBounds(420, 10, 80, 17);

        jbAdicionar.setText("+");
        jbAdicionar.setEnabled(false);
        jbAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionarActionPerformed(evt);
            }
        });
        jPanel1.add(jbAdicionar);
        jbAdicionar.setBounds(540, 10, 40, 23);

        jbRetirar.setText("-");
        jbRetirar.setEnabled(false);
        jbRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRetirarActionPerformed(evt);
            }
        });
        jPanel1.add(jbRetirar);
        jbRetirar.setBounds(540, 40, 40, 23);

        jpDadosPedido.add(jPanel1);
        jPanel1.setBounds(20, 120, 600, 240);

        jlFuncionario.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlFuncionario.setText("Funcionário:");
        jpDadosPedido.add(jlFuncionario);
        jlFuncionario.setBounds(30, 50, 100, 17);

        jlId.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlId.setText("Id:");
        jpDadosPedido.add(jlId);
        jlId.setBounds(40, 20, 70, 17);

        jlComissao.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jlComissao.setText("Comissão:");
        jpDadosPedido.add(jlComissao);
        jlComissao.setBounds(320, 50, 70, 17);

        jtpPainel.addTab("Dados do Pedido", jpDadosPedido);

        jpPesquisa.setLayout(null);

        jcbCampoPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "id", "Cliente", "Funcionário", "Data", "Situação" }));
        jpPesquisa.add(jcbCampoPesquisa);
        jcbCampoPesquisa.setBounds(30, 40, 120, 20);

        jlCampo.setText("Campo");
        jpPesquisa.add(jlCampo);
        jlCampo.setBounds(30, 20, 33, 14);
        jpPesquisa.add(jtPesquisa);
        jtPesquisa.setBounds(160, 40, 440, 20);

        jlPesquisa.setText("Pesquisa");
        jpPesquisa.add(jlPesquisa);
        jlPesquisa.setBounds(160, 20, 130, 14);

        jtbPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Data", "Cliente", "Funcionário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbPesquisaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtbPesquisa);

        jpPesquisa.add(jScrollPane2);
        jScrollPane2.setBounds(30, 80, 570, 240);

        jtpPainel.addTab("Pesquisa", jpPesquisa);

        getContentPane().add(jtpPainel);
        jtpPainel.setBounds(10, 10, 650, 400);

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
        if(br.pro.luciene.ProjetoVendas.extras.
                Validacao.validarCampos(this)){
            
        }
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

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
     //   habilitar_campos();
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbNovo.setEnabled(false);
        jdcData.getDate().toString();
}//GEN-LAST:event_jbNovoActionPerformed

    private void jcbProdutoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbProdutoItemStateChanged
        // jogar o valor do preco no respectivo campo
    }//GEN-LAST:event_jcbProdutoItemStateChanged

    private void jtbPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbPesquisaMouseClicked
        // habilitar a aba 1
        jpDadosPedido.requestFocusInWindow();
        jtpPainel.setFocusable(true);
        jtpPainel.setSelectedComponent(jpDadosPedido);
    }//GEN-LAST:event_jtbPesquisaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbAdicionar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbRetirar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox jcbCampoPesquisa;
    private javax.swing.JComboBox jcbCliente;
    private javax.swing.JComboBox jcbFuncionario;
    private javax.swing.JComboBox jcbProduto;
    private javax.swing.JComboBox jcbSituacao;
    private javax.swing.JComboBox jcbTipoMovimento;
    private com.toedter.calendar.JDateChooser jdcData;
    private javax.swing.JFormattedTextField jftDesconto;
    private javax.swing.JFormattedTextField jftPrecoTotal;
    private javax.swing.JFormattedTextField jftPrecoUnitario;
    private javax.swing.JFormattedTextField jftQuantidade;
    private javax.swing.JLabel jlCampo;
    private javax.swing.JLabel jlCliente;
    private javax.swing.JLabel jlComissao;
    private javax.swing.JLabel jlData;
    private javax.swing.JLabel jlDesconto;
    private javax.swing.JLabel jlFuncionario;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlId2;
    private javax.swing.JLabel jlPesquisa;
    private javax.swing.JLabel jlPrecoTotal;
    private javax.swing.JLabel jlPrecoUnitario;
    private javax.swing.JLabel jlProduto;
    private javax.swing.JLabel jlQuantidade;
    private javax.swing.JLabel jlSituacao;
    private javax.swing.JLabel jlSubtototal;
    private javax.swing.JLabel jlTipoMovimento;
    private javax.swing.JLabel jlTotalPedido;
    private javax.swing.JPanel jpDadosPedido;
    private javax.swing.JPanel jpPesquisa;
    private javax.swing.JTextField jtComissao;
    private javax.swing.JTextField jtPesquisa;
    private javax.swing.JTable jtbPesquisa;
    private javax.swing.JTabbedPane jtpPainel;
    // End of variables declaration//GEN-END:variables

}
