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
public class Saida {
    private int idSaida;
    private TipoMovimento tipoMovimento;
    private Cliente cliente;
    private Funcionario funcionario;
    private double comissao;
    private Timestamp dataSaida;
    private double desconto;
    private Situacao situacao;
    private List<ItemSaida> itensSaida;

    public Saida() {
        tipoMovimento = new TipoMovimento();
        cliente = new Cliente();
        funcionario = new Funcionario();
        dataSaida = new Timestamp(new java.util.Date().getTime());
        situacao = new Situacao();
        itensSaida = new ArrayList<ItemSaida>();
    }

    public Saida(int idSaida, TipoMovimento tipoMovimento, Cliente cliente, Funcionario funcionario, double comissao, Timestamp dataSaida, double desconto, Situacao situacao, List<ItemSaida> itensSaida) {
        this.idSaida = idSaida;
        this.tipoMovimento = tipoMovimento;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.comissao = comissao;
        this.dataSaida = dataSaida;
        this.desconto = desconto;
        this.situacao = situacao;
        this.itensSaida = itensSaida;
    }

    public int getIdSaida() {
        return idSaida;
    }

    public TipoMovimento getTipoMovimento() {
        return tipoMovimento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public double getComissao() {
        return comissao;
    }

    public Timestamp getDataSaida() {
        return dataSaida;
    }

    public double getDesconto() {
        return desconto;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public List<ItemSaida> getItensSaida() {
        return itensSaida;
    }
    public void adicionarItem(ItemSaida item){
        itensSaida.add(item);
    }
    
}
