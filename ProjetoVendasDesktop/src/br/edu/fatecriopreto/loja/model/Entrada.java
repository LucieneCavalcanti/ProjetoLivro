/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.fatecriopreto.loja.model;

import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author Luciene
 */
public class Entrada {
    int idEntrada;
    TipoMovimento tipoMovimento;
    Fornecedor fornecedor;
    Timestamp dataCompra;
    Timestamp dataEntrega;
    Situacao situacao;
    List<ItemEntrada> itensEntrada;
}
