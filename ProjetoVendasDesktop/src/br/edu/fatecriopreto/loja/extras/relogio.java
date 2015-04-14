/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.fatecriopreto.loja.extras;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.Timer;
import javax.swing.JLabel;

/**
 *
 * @author Luciene
 */
public class relogio extends JLabel implements ActionListener {

    public relogio() {
        Timer t = new Timer(1000, this);
        t.start();
  }

  public void actionPerformed(ActionEvent ae) {
        String mascaraHora = "HH:mm:ss";
        String hora;
        java.util.Date agora = new java.util.Date();
        SimpleDateFormat formata = new SimpleDateFormat(mascaraHora);
        hora = formata.format(agora);
        setText(hora);
    }

}
