/*
 * jfLogin.java
 *
 * Created on 1 de Abril de 2009, 21:47
 */

package br.pro.luciene.ProjetoVendas.view;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author  Administrador
 */
public class jfLogin extends javax.swing.JFrame {
    
    /** Creates new form jfLogin */
    public jfLogin() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jpfSenha = new javax.swing.JPasswordField();
        jbSair = new javax.swing.JButton();
        jbAcessar = new javax.swing.JButton();
        looks = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acesso ao Sistema");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Aparência");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 120, 70, 20);

        jtUsuario.setColumns(8);
        jtUsuario.setToolTipText("Digite o usuário");
        getContentPane().add(jtUsuario);
        jtUsuario.setBounds(100, 40, 130, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Usuário");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 40, 70, 20);

        jpfSenha.setColumns(8);
        jpfSenha.setToolTipText("Digite a senha");
        getContentPane().add(jpfSenha);
        jpfSenha.setBounds(100, 80, 130, 20);

        jbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/loja/icones/flag_red.png"))); // NOI18N
        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });
        getContentPane().add(jbSair);
        jbSair.setBounds(230, 170, 130, 30);

        jbAcessar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/loja/icones/flag_green.png"))); // NOI18N
        jbAcessar.setText("Acessar");
        jbAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(jbAcessar);
        jbAcessar.setBounds(65, 170, 130, 30);

        looks.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Padrão", "Metal", "Motif", "Windows Classic", "Plastic XP", "Plastic", "FRLook" }));
        looks.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                looksItemStateChanged(evt);
            }
        });
        looks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                looksActionPerformed(evt);
            }
        });
        getContentPane().add(looks);
        looks.setBounds(110, 120, 260, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Senha");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 80, 70, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/loja/imagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 420, 230);

        setSize(new java.awt.Dimension(431, 265));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void looksItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_looksItemStateChanged
        try {
        if (looks.getSelectedItem().toString().equals("Plastic XP"))     {
            UIManager.setLookAndFeel("com.jgoodies.looks.plastic.PlasticXPLookAndFeel");  }
        if (looks.getSelectedItem().toString().equals("Plastic"))     {
            UIManager.setLookAndFeel("com.jgoodies.looks.plastic.PlasticLookAndFeel");  }
        if (looks.getSelectedItem().toString().equals("FRLook"))     {
            UIManager.setLookAndFeel("com.shfarr.ui.plaf.fh.FhLookAndFeel");  }
        if (looks.getSelectedItem().toString().equals("Windows Classic"))     {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");  }
        if (looks.getSelectedItem().toString().equals("Motif"))     {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");  }
        if (looks.getSelectedItem().toString().equals("Metal"))     {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");  }
        if (looks.getSelectedItem().toString().equals("Padrão"))     {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");  }
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    SwingUtilities.updateComponentTreeUI(this);
    
}//GEN-LAST:event_looksItemStateChanged

private void jbAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAcessarActionPerformed
if (br.pro.luciene.ProjetoVendas.extras.Validacao.validarCampos(this)) {
    if (validar_senha()) {
        this.dispose();
        jfPrincipal objPrincipal = new jfPrincipal();
        objPrincipal.setVisible(true);
    }
    else
        JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos !", "Verificação", JOptionPane.ERROR_MESSAGE);
}
}//GEN-LAST:event_jbAcessarActionPerformed

private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
    System.exit(0);    // TODO add your handling code here:
}//GEN-LAST:event_jbSairActionPerformed

    private void looksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_looksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_looksActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfLogin().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbAcessar;
    private javax.swing.JButton jbSair;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTextField jtUsuario;
    private javax.swing.JComboBox looks;
    // End of variables declaration//GEN-END:variables

    private boolean validar_senha() {
        if (jtUsuario.getText().equals("fatec")
            && jpfSenha.getText().equals("2015"))
        return true;
        else return false;
    
}
}