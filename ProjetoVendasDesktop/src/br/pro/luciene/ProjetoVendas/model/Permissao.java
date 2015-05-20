/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.pro.luciene.ProjetoVendas.model;

/**
 *
 * @author Luciene
 */
public class Permissao {
    private int sequencia;
    private Modulo modulo;
    private int niveldeAcesso;

    public Permissao() {
        sequencia=0;
        modulo = new Modulo(); //obrigatório
        niveldeAcesso = 0;
    }

    public Permissao(int sequencia, Modulo modulo, int niveldeAcesso) {
        this.sequencia = sequencia;
        this.modulo = modulo;
        this.niveldeAcesso = niveldeAcesso;
    }

    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    public int getNiveldeAcesso() {
        return niveldeAcesso;
    }

    public void setNiveldeAcesso(int niveldeAcesso) {
        this.niveldeAcesso = niveldeAcesso;
    }
    
}
