/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.fatecriopreto.loja.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Luciene
 */
public class teste2 {
    public static void main(String[] args) {
        float nota1=0, nota2=0;
        do{
            try{
                nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1"));
                JOptionPane.showMessageDialog(null, "A nota digitada foi:" + nota1);
            }catch(NumberFormatException erro){
                JOptionPane.showMessageDialog(null, "Digite apenas números");
            }
            catch(Exception erro){
                JOptionPane.showMessageDialog(null, "Erro:"+ erro.getMessage());
            }
        }while(nota1<=0 || nota1>10);
        
        try{
            nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2"));
            JOptionPane.showMessageDialog(null, "A nota digitada foi:" + nota2);
        }catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Digite apenas números");
        }
    }
}
