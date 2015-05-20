/*
 * fixedLengthDocument.java
 *
 * Created on 13 de Novembro de 2005, 17:17
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package br.pro.luciene.ProjetoVendas.extras;

import javax.swing.*;
import javax.swing.text.*;

/**
 *
 * @author Lucas
 */
public class fixedLengthDocument extends PlainDocument {
    
    private int iMaxLength;    
    
    /**
     * Creates a new instance of fixedLengthDocument 
     */
    public fixedLengthDocument(int maxlen) {
        super();
        iMaxLength = maxlen;
    }
    
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if (str == null)
            return;
        if (iMaxLength <= 0) { // aceitara qualquer no. de caracteres
            super.insertString(offset, str, attr);
            return;
        }
        int ilen = (getLength() + str.length());
        if (ilen <= iMaxLength) // se o comprimento final for menor...
            super.insertString(offset, str, attr); // ...aceita str
        else {
            if (getLength() == iMaxLength)
                return; // nada a fazer
            String newStr = str.substring(0, (iMaxLength - getLength()));
            super.insertString(offset, newStr, attr);
        }
    }    
}




