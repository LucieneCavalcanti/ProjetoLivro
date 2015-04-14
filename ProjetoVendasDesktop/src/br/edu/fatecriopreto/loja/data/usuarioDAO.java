/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.fatecriopreto.loja.data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import br.edu.fatecriopreto.loja.bean.UsuarioBean;
import java.io.IOException;

/**
 *
 * @author Alunos
 */
public class usuarioDAO extends Conexao {
public usuarioDAO() throws IOException, SQLException, ClassNotFoundException{
    
}
    public UsuarioBean ValidarUsuario(UsuarioBean objUsuario) throws SQLException
    {
        PreparedStatement pstmt = getConexao().prepareStatement(
"SELECT * FROM usuario where login = ? and senha = ?");
        pstmt.setString(1,objUsuario.getLogin());
        pstmt.setString(2,objUsuario.getSenha());
        ResultSet rs = pstmt.executeQuery();
        objUsuario = null;
        if (rs.next()){
            objUsuario = new UsuarioBean();
            objUsuario.setLogin(rs.getString("login"));
            objUsuario.setSenha(rs.getString("senha"));
            objUsuario.setTipo(rs.getInt("tipo"));
        }
        pstmt.close();
        return objUsuario;
}
public boolean Inclui(Usuario objUsuario) 
        throws SQLException    {
    Conexao con = new Conexao();    
    PreparedStatement pstmt = con.getConexao().prepareStatement
        ("INSERT INTO usuario (usuario, senha, tipo)" +
                " VALUES (?,?,?)");
        pstmt.setString(1, objUsuario.getLogin());
        pstmt.setString(2, objUsuario.getSenha());
        pstmt.setInt(3, objUsuario.getTipo());
        int registros = pstmt.executeUpdate();
        pstmt.close();
        if (registros == 1){
            return true; }
        else {
            return false; }
}



public Usuario Pesquisar(String nomeUsuario) throws SQLException
    {
        Conexao con = new Conexao();
        PreparedStatement pstmt = con.getConexao().
          prepareStatement(
        "SELECT * FROM usuarios where usuario = ?");
        pstmt.setString(1,nomeUsuario);
        ResultSet rs = pstmt.executeQuery();
        Usuario objUsuario = null;
        if (rs.next()){
            objUsuario = new Usuario();
            objUsuario.setLogin(rs.getString("usuario"));
            objUsuario.setSenha(rs.getString("senha"));
            objUsuario.setTipo(rs.getInt("tipo"));
        }
        pstmt.close();
        return objUsuario;
}




public boolean Excluir(String nomeUsuario) throws SQLException
    {
        Conexao con = new Conexao();
        PreparedStatement pstmt = con.getConexao().prepareStatement(
        "DELETE FROM usuarios where usuario = ?");
        pstmt.setString(1,nomeUsuario);
        int registros = pstmt.executeUpdate();
        if (registros>=1){
            return true;        }
        else {
            return false;      }

}







public boolean Editar(Usuario objUsuario) 
        throws SQLException    {
    Conexao con = new Conexao();    
    PreparedStatement pstmt = con.getConexao().prepareStatement
        ("UPDATE usuarios set senha = ?, tipo=?"
            + " where usuario=?");
        pstmt.setString(1, objUsuario.getSenha());
        pstmt.setInt(2, objUsuario.getTipo());
        pstmt.setString(3, objUsuario.getUsuario());
        int registros = pstmt.executeUpdate();
        pstmt.close();
        if (registros >= 1){
            return true; }
        else {
            return false; }
}

public Vector Lista(String arg) throws SQLException
    {
        Vector linhas = new Vector();
        PreparedStatement pstmt = getConexao().
                prepareStatement("SELECT * FROM usuario where login like '"+ arg +"%' order by login");
        ResultSet rs = pstmt.executeQuery();
        // percorre a lista de resultado da query:
        while(rs.next())
        {
            UsuarioBean objUsuario = new UsuarioBean();
            objUsuario.setLogin(rs.getString("login").trim());
            objUsuario.setSenha(rs.getString("senha").trim());
            objUsuario.setTipo(rs.getInt("tipo"));

            Vector novalinha = new Vector();
            novalinha.addElement(objUsuario.getLogin());
            novalinha.addElement(objUsuario.getSenha());
            novalinha.addElement(objUsuario.getTipo());
            linhas.addElement(novalinha);
        }
        return linhas;
}


public Vector listar() throws SQLException
    {
        Vector matriz = new Vector();
        Conexao con = new Conexao();
        PreparedStatement pstmt = con.getConexao().
          prepareStatement(
        "SELECT * FROM usuarios order by usuario");
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()){
            Vector novaLinha = new Vector();
            novaLinha.add(rs.getString("usuario"));
            novaLinha.add(rs.getInt("tipo"));
            matriz.add(novaLinha);
        }
        pstmt.close();
        return matriz;
}




public Vector listar(String nomeUsuario) throws SQLException
    {
        Vector matriz = new Vector();
        Conexao con = new Conexao();
        PreparedStatement pstmt = con.getConexao().
          prepareStatement(
        "SELECT * FROM usuarios where usuario like '" + nomeUsuario + "%' order by usuario");
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()){
            Vector novaLinha = new Vector();
            novaLinha.add(rs.getString("usuario"));
            novaLinha.add(rs.getInt("tipo"));
            matriz.add(novaLinha);
        }
        pstmt.close();
        return matriz;
}
public Vector listarOrdenadoporUsuario(String nomeUsuario) throws SQLException
    {
        Vector matriz = new Vector();
        Conexao con = new Conexao();
        PreparedStatement pstmt = con.getConexao().
          prepareStatement(
        "SELECT * FROM usuarios where usuario like '" + nomeUsuario + "%' order by usuario");
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()){
            Vector novaLinha = new Vector();
            novaLinha.add(rs.getString("usuario"));
            novaLinha.add(rs.getInt("tipo"));
            matriz.add(novaLinha);
        }
        pstmt.close();
        return matriz;
}
public Vector listarOrdenadoporTipo(String nomeUsuario) throws SQLException
    {
        Vector matriz = new Vector();
        Conexao con = new Conexao();
        PreparedStatement pstmt = con.getConexao().
          prepareStatement(
        "SELECT * FROM usuarios where usuario like '" + nomeUsuario + "%' order by tipo");
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()){
            Vector novaLinha = new Vector();
            novaLinha.add(rs.getString("usuario"));
            novaLinha.add(rs.getInt("tipo"));
            matriz.add(novaLinha);
        }
        pstmt.close();
        return matriz;
}
}
