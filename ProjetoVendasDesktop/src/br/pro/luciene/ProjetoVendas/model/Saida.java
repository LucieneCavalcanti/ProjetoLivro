/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.pro.luciene.ProjetoVendas.model;

import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author Luciene
 */
public class Saida {
    int idSaida;
    TipoMovimento tipoMovimento;
    Cliente cliente;
    Funcionario funcionario;
    double comissao;
    Timestamp dataSaida;
    Situacao situacao;
    List<ItemSaida> itensSaida;
}
