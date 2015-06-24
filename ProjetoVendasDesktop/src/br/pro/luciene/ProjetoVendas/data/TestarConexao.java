/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.pro.luciene.ProjetoVendas.data;

import javax.swing.JOptionPane;

/**
 *
 * @author Luciene
 */
public class TestarConexao {
    public static void main(String[] args) {
        try {
            Conexao con = new Conexao();
            JOptionPane.showMessageDialog(null, "Conexão OK");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: "
                    + erro.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
