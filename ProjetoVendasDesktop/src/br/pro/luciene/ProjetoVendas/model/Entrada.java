/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.pro.luciene.ProjetoVendas.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luciene
 */
public class Entrada {
    private int idEntrada;
    private TipoMovimento tipoMovimento;
    private Fornecedor fornecedor;
    private Timestamp dataCompra;
    private Timestamp dataEntrega;
    private Situacao situacao;
    private List<ItemEntrada> itensEntrada;

    public Entrada() {
        tipoMovimento = new TipoMovimento();
        fornecedor = new Fornecedor();
        dataCompra = new Timestamp(new java.util.Date().getTime());
        dataEntrega = new Timestamp(new java.util.Date().getTime());
        situacao = new Situacao();
        itensEntrada = new ArrayList<ItemEntrada>();
    }

    public Entrada(int idEntrada, TipoMovimento tipoMovimento, Fornecedor fornecedor, Timestamp dataCompra, Timestamp dataEntrega, Situacao situacao, List<ItemEntrada> itensEntrada) {
        this.idEntrada = idEntrada;
        this.tipoMovimento = tipoMovimento;
        this.fornecedor = fornecedor;
        this.dataCompra = dataCompra;
        this.dataEntrega = dataEntrega;
        this.situacao = situacao;
        this.itensEntrada = itensEntrada;
    }

    public List<ItemEntrada> getItensEntrada() {
        return itensEntrada;
    }

    public void setItensEntrada(List<ItemEntrada> itensEntrada) {
        this.itensEntrada = itensEntrada;
    }

    public int getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(int idEntrada) {
        this.idEntrada = idEntrada;
    }

    public TipoMovimento getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(TipoMovimento tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Timestamp getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Timestamp dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Timestamp getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Timestamp dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }
    public void adicionarItem(ItemEntrada item){
        itensEntrada.add(item);
    }
    
}
