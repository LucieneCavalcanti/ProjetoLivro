/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.fatecriopreto.loja.model;

/**
 *
 * @author Diretor
 */
public class Telefone {
    private int sequencia;
    private String tipo;
    private String ddd;
    private String telefone;

    public Telefone() {
    }

    public Telefone(int sequencia, String tipo, String ddd, String telefone) {
        this.sequencia = sequencia;
        this.tipo = tipo;
        this.ddd = ddd;
        this.telefone = telefone;
    }

    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    

}
