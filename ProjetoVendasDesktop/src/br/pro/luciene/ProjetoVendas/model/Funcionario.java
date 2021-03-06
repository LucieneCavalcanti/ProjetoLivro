/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.pro.luciene.ProjetoVendas.model;

import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author Luciene
 */
public class Funcionario extends PessoaFisica implements AcessarSistema {
    private String CTPS;
    private String cargo;
    private String departamento;
    private String senha;

    public Funcionario() {
    }

    public Funcionario(String CTPS, String cargo, 
            String departamento, String senha, String rg, 
            String cpf, Timestamp dataNascimento, 
            int idPessoa, String nome, String email, 
            String endereco, String numero, String bairro, 
            String complemento, String cep, String cidade, 
            String uf, Situacao situacao, 
            Timestamp dataCadastro, List<Telefone> telefones) {

        super(rg, cpf, dataNascimento, idPessoa, nome, email, 
                endereco, numero, bairro, complemento, cep, 
                cidade, uf, situacao, dataCadastro, telefones);
        this.CTPS = CTPS;
        this.cargo = cargo;
        this.departamento = departamento;
        this.senha = senha;
    }

    public String getCTPS() {
        return CTPS;
    }

    public void setCTPS(String CTPS) {
        this.CTPS = CTPS;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public String getSenha(){
        return senha;
    }

    public String toString() {
        return getNome();
    }

    @Override
    public boolean login() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Permissao> verificarPermissoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
