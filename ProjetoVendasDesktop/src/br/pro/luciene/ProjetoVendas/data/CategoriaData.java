/*
 * ClienteDAO.java
 *
 * Created on 15 de Maio de 2007, 09:46
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package br.pro.luciene.ProjetoVendas.data;

import java.sql.CallableStatement;
import br.pro.luciene.ProjetoVendas.model.Produto;
import br.pro.luciene.ProjetoVendas.model.Categoria;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class CategoriaData extends Conexao {

    /**
     * Creates a new instance of ClienteDAO
     */
    public CategoriaData() throws Exception {
    }

    public static Vector<Categoria> carregarCombo() throws SQLException {
        Vector linhas = new Vector();
        PreparedStatement pstmt
                = getConexao().prepareStatement("SELECT * FROM categoria order by descricao");
        ResultSet rs = pstmt.executeQuery();
        linhas.addElement(new Categoria(0, "<selecione>"));

        // percorre a lista de resultado da query:
        while (rs.next()) {
            Categoria objCategoria = new Categoria();
            objCategoria.setIdCategoria(rs.getInt("idCategoria"));
            objCategoria.setDescricao(rs.getString("descricao"));
            linhas.addElement(objCategoria);
        }

        return linhas;
    }

    public Categoria obter(int id) throws SQLException {
        Categoria objCategoria = null;
        PreparedStatement pstmt = getConexao().prepareStatement("SELECT * FROM produtos where codigo = ?");
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            objCategoria = new Categoria(rs.getInt("idCategoria"),
                    rs.getString("descricao"));
        }
        return objCategoria;
    }

    public Vector pesquisar(String arg) throws SQLException {
        Vector linhas = new Vector();
        PreparedStatement pstmt = getConexao().prepareStatement("SELECT * FROM produtos where descricao like %'?'%");
        pstmt.setString(1, arg);
        ResultSet rs = pstmt.executeQuery();
        // percorre a lista de resultado da query:
        while (rs.next()) {
            Vector novalinha = new Vector();
            linhas.addElement(novalinha);
        }
        return linhas;
    }

    public boolean excluir(int codigo) throws SQLException {
        PreparedStatement pstmt = getConexao().prepareStatement("DELETE FROM produtos where codigo = ?");
        pstmt.setInt(1, codigo);
        int resultado = pstmt.executeUpdate();
        pstmt.close();
        if (resultado > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean incluir(Categoria objCategoria) throws SQLException {
        PreparedStatement pstmt = getConexao().prepareStatement("INSERT INTO categorias (descricao) VALUES (?)");
        pstmt.setString(1, objCategoria.getDescricao());
        int resultado = pstmt.executeUpdate();
        pstmt.close();
        if (resultado > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean alterar(Produto objProduto) throws Exception {
       PreparedStatement pstmt = getConexao().prepareStatement("UPDATE produtos SET descricao = ?, qtde = ?, preco_custo = ?, preco_venda = ? WHERE codigo = ?");
        int resultado = pstmt.executeUpdate();
        pstmt.close();
        if (resultado > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean incluirPorProcedure(Categoria objCategoria) throws SQLException {
        CallableStatement callable = getConexao().
                prepareCall("{call cadastrarCategoria (?,?)}");
        callable.setInt(1, objCategoria.getIdCategoria());
        callable.setString(2, objCategoria.getDescricao());
        int registros = callable.executeUpdate();
        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }

    public int IncluirporProcedure2(String descricao) throws Exception {
        Conexao conexao = new Conexao();
        CallableStatement callable = conexao.getConexao().
                prepareCall("{? = call cadastrarCategoria5 (?)}");
        callable.setString(2, descricao);
        callable.registerOutParameter(1, java.sql.Types.INTEGER);
        callable.execute();
        return callable.getInt(1);
    }
}
