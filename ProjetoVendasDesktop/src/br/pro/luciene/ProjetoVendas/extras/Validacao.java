/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.luciene.ProjetoVendas.extras;

import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Administrador
 */
public class Validacao {

    static JTextField jt = null;
    static JFormattedTextField jft = null;
    static JPasswordField jpf = null;
    static JRadioButton jr = null;
    static JPanel jp = null;
    static JMoneyField jm = null;
    static JComboBox jcb = null;
    static JDateChooser jdc = null;
    static JTabbedPane jtp = null;
    static JTable jtb = null;

    public static boolean validarCampos(Component[] componentes) {
        for (Component c : componentes) {
            if (c instanceof JTextField) {
                jt = (JTextField) c;
                if (jt.getText().equals("") && 
                        !jt.getToolTipText().equals("")){
                    JOptionPane.showMessageDialog(null, jt.getToolTipText(), "Validação", JOptionPane.ERROR_MESSAGE);
                    jt.requestFocus();
                    return false;
                }
            }
            if (c instanceof JPasswordField) {
                jpf = (JPasswordField) c;
                if (jpf.getText().equals("") && 
                        !jpf.getToolTipText().equals("")) {
                    JOptionPane.showMessageDialog(null, jpf.getToolTipText(), "Validação", JOptionPane.ERROR_MESSAGE);
                    jpf.requestFocus();
                    return false;
                }
            }
            if (c instanceof JComboBox) {
                jcb = (JComboBox) c;
                System.out.println(c.getName());
                if (jcb.getSelectedIndex() == 0 && 
                        jcb.getToolTipText()!=null) {
                    JOptionPane.showMessageDialog(null, jcb.getToolTipText(), "Validação", JOptionPane.ERROR_MESSAGE);
                    jcb.requestFocus();
                    return false;
                }

            }
            //ver radiobutton
            if (c instanceof JPanel) {
                jp = (JPanel) c;
                Component[] painel = jp.getComponents();
                validarCampos(painel);
            }
            if(c instanceof JTabbedPane){
                jtp = (JTabbedPane) c;
                Component[] painel = jtp.getComponents();
                validarCampos(painel);
            }

        }

        return true;
    }

    public static boolean validarCampos(JInternalFrame form) {
        Component[] componentes = form.getContentPane().getComponents();
        return validarCampos(componentes);
    }

    public static boolean validarCampos(JFrame form) {
        Component[] componentes = form.getContentPane().getComponents();
        return validarCampos(componentes);
    }

    public static void limparCampos(Component[] componentes) {
        for (Component c : componentes) {
            if (c instanceof JTextField) {
                jt = (JTextField) c;
                jt.setText("");
            }
            if (c instanceof JFormattedTextField) {
                //verificar a máscara
                jft = (JFormattedTextField) c;
                jft.setText("");
            }
            if (c instanceof JPasswordField) {
                jpf = (JPasswordField) c;
                jpf.setText("");
            }
            if (c instanceof JRadioButton) {
                jr = (JRadioButton) c;
                jr.setSelected(false);
            }
            if (c instanceof JComboBox) {
                jcb = (JComboBox) c;
                jcb.setSelectedIndex(0);
            }
            if (c instanceof JDateChooser) {
                jdc = (JDateChooser) c;
                jdc.setDate(null);
            }
            if (c instanceof JMoneyField) {
                jm = (JMoneyField) c;
                jm.setText(null);
            }
            if (c instanceof JPanel) {
                jp = (JPanel) c;
                Component[] painel = jp.getComponents();
                limparCampos(painel);
            }
        }
    }

    public static void limparCampos(JFrame form) {
        Component[] componentes
                = form.getContentPane().getComponents();
        limparCampos(componentes);
    }

    public static void limparCampos(JInternalFrame form) {
        Component[] componentes
                = form.getContentPane().getComponents();
        limparCampos(componentes);
    }

    private static void tratarCampos(Component[] componentes, boolean b) {
        for (Component c : componentes) {
            if ((!(c instanceof JLabel)) && (!(c instanceof JPanel))) {
                c.setEnabled(b);
            }
            if (c instanceof JPanel) {
                jp = (JPanel) c;
                Component[] painel = jp.getComponents();
//            for (Component p : componentes) {
//                if (!(p instanceof JLabel)) {
//                    p.setEnabled(b);
//                }
//            }
                tratarCampos(painel, b);
            }
            if (c instanceof JTabbedPane) {
                jtp = (JTabbedPane) c;
                Component[] painel = jtp.getComponents();
                tratarCampos(painel, b);
            }
        }
   }

    public static void tratarCampos(JFrame form, boolean b) {
        Component[] componentes
                = form.getContentPane().getComponents();
        tratarCampos(componentes, b);
    }

    public static void tratarCampos(JInternalFrame form, boolean b) {
        Component[] componentes
                = form.getContentPane().getComponents();
        tratarCampos(componentes, b);
    }
//
//    public static void habilitar_campos(JInternalFrame form) {
//        Component[] componentes = form.getContentPane().getComponents();
//        for (Component c : componentes) {
//            if (c instanceof JTextField) {
//                jt = (JTextField) c;
//                jt.setEditable(true);
//            }
//            if (c instanceof JPasswordField) {
//                jpf = (JPasswordField) c;
//                jpf.setEditable(true);
//            }
//            if (c instanceof JRadioButton) {
//                jr = (JRadioButton) c;
//                jr.setEnabled(true);
//            }
//            if (c instanceof JMoneyField) {
//                jm = (JMoneyField) c;
//                jm.setEditable(true);
//            }
//            if (c instanceof JComboBox) {
//                jcb = (JComboBox) c;
//                jcb.setEnabled(true);
//            }
//            if (c instanceof JDateChooser) {
//                jdc = (JDateChooser) c;
//                jdc.setEnabled(true);
//            }
//            if (c instanceof JPanel) {
//                jp = (JPanel) c;
//                Component[] painel = jp.getComponents();
//                for (Component p : componentes) {
//
//                }
//            }
//        }
//    }
//
//    public static void desabilitar_campos(JFrame form) {
//        Component[] componentes = form.getContentPane().getComponents();
//        for (Component c : componentes) {
//            if (c instanceof JTextField) {
//                jt = (JTextField) c;
//                jt.setEditable(false);
//            }
//            if (c instanceof JPasswordField) {
//                jpf = (JPasswordField) c;
//                jpf.setEditable(false);
//            }
//            if (c instanceof JRadioButton) {
//                jr = (JRadioButton) c;
//                jr.setEnabled(false);
//            }
//            if (c instanceof JMoneyField) {
//                jm = (JMoneyField) c;
//                jm.setEditable(false);
//            }
//            if (c instanceof JComboBox) {
//                jcb = (JComboBox) c;
//                jcb.setEnabled(false);
//            }
//            if (c instanceof JPanel) {
//                jp = (JPanel) c;
//                Component[] painel = jp.getComponents();
//                for (Component p : componentes) {
//
//                }
//            }
//        }
//
//    }
//
//    public static void desabilitar_campos(JInternalFrame form) {
//        Component[] componentes = form.getContentPane().getComponents();
//        for (Component c : componentes) {
//            if (c instanceof JTextField) {
//                jt = (JTextField) c;
//                jt.setEditable(false);
//            }
//            if (c instanceof JPasswordField) {
//                jpf = (JPasswordField) c;
//                jpf.setEditable(false);
//            }
//            if (c instanceof JRadioButton) {
//                jr = (JRadioButton) c;
//                jr.setEnabled(false);
//            }
//            if (c instanceof JDateChooser) {
//                jdc = (JDateChooser) c;
//                jdc.setEnabled(false);
//            }
//            if (c instanceof JPanel) {
//                jp = (JPanel) c;
//                Component[] painel = jp.getComponents();
//                for (Component p : componentes) {
//
//                }
//            }
//        }
//
//    }

    public static boolean validarCEP(String cep) {
        if (cep.length() != 9) {
            return false;
        } else if ((cep.charAt(5) == '-')) {
            return true;
        }
        return false;
    }
}
