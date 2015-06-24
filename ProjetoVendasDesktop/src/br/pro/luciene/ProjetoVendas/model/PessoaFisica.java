package br.pro.luciene.ProjetoVendas.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public abstract class PessoaFisica 
extends Pessoa {
    private String rg;
    private String cpf;
    private Timestamp dataNascimento;
    
   // private List<Permissao> permissoes;


    public PessoaFisica() {
     //   permissoes = new ArrayList<Permissao>();
    }

    public PessoaFisica(String rg, String cpf, 
            Timestamp dataNascimento, //String senha, 
            //List<Permissao> permissoes, 
            int idPessoa, String nome, String email, 
            String endereco, String numero, String bairro,
            String complemento, String cep, String cidade,
            String uf, Situacao situacao, 
            Timestamp dataCadastro, List<Telefone> telefones) {
        super(idPessoa, nome, email, endereco, numero, bairro, 
                complemento, cep, cidade, uf, situacao, 
                dataCadastro, telefones);
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
//        this.senha = senha;
//        this.permissoes = permissoes;
    }

    
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Timestamp getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Timestamp dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

   
//    public List<Permissao> getPermissoes() {
//        return permissoes;
//    }
//
//    public void setPermissoes(List<Permissao> permissoes) {
//        this.permissoes = permissoes;
//    }
    
}