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
public class TipoMovimento {
    private int idTipo;
    private String descricao;
    private int tipoLancamento;

    public TipoMovimento() {
        idTipo=0;
        descricao="";
        tipoLancamento=0;
    }

    public TipoMovimento(int idTipo, String descricao, int tipoLancamento) {
        this.idTipo = idTipo;
        this.descricao = descricao;
        this.tipoLancamento = tipoLancamento;
    }

    
    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTipoLancamento() {
        return tipoLancamento;
    }

    public void setTipoLancamento(int tipoLancamento) {
        this.tipoLancamento = tipoLancamento;
    }
    public String toString(){
        return descricao;
    }
}
