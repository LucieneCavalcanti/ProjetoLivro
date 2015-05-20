/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.pro.luciene.ProjetoVendas.extras;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.Timer;
import javax.swing.JLabel;

/**
 *
 * @author Luciene
 */
public class relogioCronometro extends JLabel implements ActionListener {
    int segundos=0;
    java.util.Date agora = new java.util.Date(0, 0, 0, 0, 0);
    public relogioCronometro() {
        
        Timer t = new Timer(1000, this);
        segundos++;
        t.start();
  }

  public void actionPerformed(ActionEvent ae) {
        String mascaraHora = "HH:mm:ss";
        String hora;
        segundos++;
        agora.setSeconds(segundos);
        SimpleDateFormat formata = new SimpleDateFormat(mascaraHora);
        hora = formata.format(agora);
        setText(hora);
    }

}
