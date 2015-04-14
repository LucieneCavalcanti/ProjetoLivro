package br.edu.fatecriopreto.loja.model;

import java.sql.Timestamp;
import java.util.List;

public abstract class 
    PessoaJuridica extends 
        Pessoa {
    private String cnpj;
    private String ie;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String cnpj, String ie, int idPessoa, String nome, String email, String endereco, String numero, String bairro, String complemento, String cep, String cidade, String uf, Situacao situacao, Timestamp dataCadastro, List<Telefone> telefones) {
        super(idPessoa, nome, email, endereco, numero, bairro, complemento, cep, cidade, uf, situacao, dataCadastro, telefones);
        this.cnpj = cnpj;
        this.ie = ie;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }
    
}
