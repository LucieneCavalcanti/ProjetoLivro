/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.pro.luciene.ProjetoVendas.model;

import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author Diretor
 */
public class Fornecedor extends PessoaJuridica {
    private int idMatricula;
    private String nomeVendedor;

    public Fornecedor() {
    }

    public Fornecedor(int idMatricula, String nomeVendedor, String cnpj, String ie, int idPessoa, String nome, String email, String endereco, String numero, String bairro, String complemento, String cep, String cidade, String uf, Situacao situacao, Timestamp dataCadastro, List<Telefone> telefones) {
        super(cnpj, ie, idPessoa, nome, email, endereco, numero, bairro, complemento, cep, cidade, uf, situacao, dataCadastro, telefones);
        this.idMatricula = idMatricula;
        this.nomeVendedor = nomeVendedor;
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }
public String toString() {
        return getNome();
    }
}
