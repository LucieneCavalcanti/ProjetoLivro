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
public class Cliente extends PessoaFisica{
    private String empresa;

    public Cliente() {
    }

    public Cliente(String empresa, String rg, String cpf, Timestamp dataNascimento, String senha, List<Permissao> permissoes, int idPessoa, String nome, String email, String endereco, String numero, String bairro, String complemento, String cep, String cidade, String uf, Situacao situacao, Timestamp dataCadastro, List<Telefone> telefones) {
        super(rg, cpf, dataNascimento, senha, permissoes, idPessoa, nome, email, endereco, numero, bairro, complemento, cep, cidade, uf, situacao, dataCadastro, telefones);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
}
