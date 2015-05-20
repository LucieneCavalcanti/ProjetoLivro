package br.pro.luciene.ProjetoVendas.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public abstract class Pessoa {
    private int idPessoa;
    private String nome;
    private String email;
    private String endereco;
    private String numero;
    private String bairro;
    private String complemento;
    private String cep;
    private String cidade;
    private String uf;
    private Situacao situacao; //1 situacao
    private Timestamp dataCadastro;
    private List<Telefone> telefones; //muitos telefones

    public Pessoa() {
        
        situacao = new Situacao();
        dataCadastro = new Timestamp(Calendar.
                getInstance().getTime().getTime());
        telefones = new ArrayList<Telefone>();
    }

    public Pessoa(int idPessoa, String nome, String email, String endereco, String numero, String bairro, String complemento, String cep, String cidade, String uf, Situacao situacao, Timestamp dataCadastro, List<Telefone> telefones) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
        this.situacao = situacao;
        this.dataCadastro = dataCadastro;
        this.telefones = telefones;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public Timestamp getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Timestamp dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }
    public void adicionarTelefone(Telefone tel){
        telefones.add(tel);
    }
   
}
