/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.fatecriopreto.loja.model;

public class Categoria {
    private int idCategoria;
    private String descricao;

    public Categoria() {
    }

    public Categoria(int idCategoria, String descricao) {
        this.idCategoria = idCategoria;
        this.descricao = descricao;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
