/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.pro.luciene.ProjetoVendas.extras;

import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Alunos
 */
public class FormatarCampos {
    static MaskFormatter objMascara;

            /*    //http://java.sun.com/j2se/1.4.2/docs/api/javax/swing/text/MaskFormatter.html

            # => Usa número válido, usa Character.isDigit
            ' => Caractere de escape, usado para escape de qualquer caractere de formato especial
            U =>Qualquer caractere(Character.isLetter). Todas as letras minúsculas são transformadas em maiúsculas.
            L => Qualquer caractere(Character.isLetter). Todas as letras maiúsculas são transformadas em minúsculas.
            A => Qualquer caractere ou digito (Character.isLetter ou Character.isDigit)
            ? => Qualquer caractere
            * => Qualquer coisa
            H => Qualquer caractere hexadecima(0-9, a-f ou A-F)

            */
              
    public static void mascararData(JFormattedTextField campo)
    throws Exception{
        objMascara = new MaskFormatter("##/##/####");
        objMascara.setValidCharacters("1234567890"); // caracteres válidos
        objMascara.setPlaceholderCharacter(' '); // preenchimento            
        objMascara.install(campo);
    }
    
    public static void mascararTelefone(JFormattedTextField campo) 
    throws Exception{
        objMascara = new MaskFormatter("(##)####-####");
        objMascara.setValidCharacters("1234567890"); // caracteres válidos
        objMascara.setPlaceholderCharacter(' '); // preenchimento            
        objMascara.install(campo);
    }
    
     public static void mascararCep(JFormattedTextField campo)
     throws Exception {
        objMascara = new MaskFormatter("#####-###");
        objMascara.setValidCharacters("1234567890"); // caracteres válidos
        objMascara.setPlaceholderCharacter(' '); // preenchimento            
        objMascara.install(campo);
    }

    public static void mascararNumero(JFormattedTextField campo) 
    throws Exception {
            objMascara = new MaskFormatter("######");
            objMascara.setValidCharacters("1234567890"); // caracteres válidos
            objMascara.setPlaceholderCharacter(' '); // preenchimento
            objMascara.install(campo);
    }

    public static void fixarTamanhoCampo(JFormattedTextField campo,int tamanho)
    throws Exception {
        campo.setDocument(new fixedLengthDocument(6));
    }
}
