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
public class Estoque {
    private int sequencia;
    private double quantidadeMinima;
    private double quantidadeAtual;

    public Estoque() {
    }

    public Estoque(int sequencia, double quantidadeMinima, double quantidadeAtual) {
        this.sequencia = sequencia;
        this.quantidadeMinima = quantidadeMinima;
        this.quantidadeAtual = quantidadeAtual;
    }

    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

    public double getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(double quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }

    public double getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public void setQuantidadeAtual(double quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }
    
    
}
