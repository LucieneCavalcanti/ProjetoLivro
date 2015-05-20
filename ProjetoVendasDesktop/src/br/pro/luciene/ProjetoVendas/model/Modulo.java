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
public class Modulo {
    private int idModulo;
    private String descricao;

    public Modulo() {
    }

    public Modulo(int idModulo, String descricao) {
        this.idModulo = idModulo;
        this.descricao = descricao;
    }

    public int getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(int idModulo) {
        this.idModulo = idModulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
