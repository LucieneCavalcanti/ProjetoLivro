/*
 * ClienteDAO.java
 *
 * Created on 15 de Maio de 2007, 09:46
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package br.edu.fatecriopreto.loja.data;

import br.edu.fatecriopreto.loja.model.Produto;
import br.edu.fatecriopreto.loja.model.Categoria;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import br.edu.fatecriopreto.loja.model.Telefone;

/**
 *
 * @author Administrador
 */
public class TelefoneDAO {
    
    /** Creates a new instance of ClienteDAO */
    public TelefoneDAO() {
    }

public ResultSet Relatorio()
    {
        Conexao conexao = new Conexao();
        
        Vector linhas = new Vector();
        ResultSet rs = null;
        
        try
        {
            PreparedStatement pstmt = conexao.getConexao().prepareStatement("SELECT * FROM produtos order by codigo");
            rs = pstmt.executeQuery();
       
        }
                catch(SQLException ex){
            System.out.println("erro ao listar");
       }
        return rs;
 }
       
public Vector Lista()
    {
        Conexao conexao = new Conexao();
        
        Vector linhas = new Vector();
            
        try
        {
            PreparedStatement pstmt = conexao.getConexao().prepareStatement("SELECT * FROM produtos order by codigo");
            ResultSet rs = pstmt.executeQuery();

            // percorre a lista de resultado da query:
            while(rs.next())
            {
                Produto objProduto = new Produto();
                objProduto.setCodigo(rs.getInt("codigo"));
                objProduto.setDescricao(rs.getString("descricao"));
                objProduto.setQuantidade(rs.getInt("qtde"));
                objProduto.setPreco_custo(rs.getFloat("preco_custo"));
                objProduto.setPreco_venda(rs.getFloat("preco_venda"));
  
                Vector novalinha = new Vector();
                novalinha.addElement(objProduto.getCodigo());
                novalinha.addElement(objProduto.getDescricao());
                novalinha.addElement(objProduto.getQuantidade());
                novalinha.addElement(objProduto.getPreco_custo());
                novalinha.addElement(objProduto.getPreco_venda());
                linhas.addElement(novalinha);
            }
        }
        catch(SQLException ex){
           JOptionPane.showMessageDialog(null,"Ocorreu um erro !","Listar - Clientes", 3);
        }
        
        return linhas;
}
    
public Categoria BuscarChave(String descricao) throws SQLException
    {
        Conexao conexao = new Conexao();
        Categoria objCategoria =null;
        PreparedStatement pstmt =
       conexao.getConexao().prepareStatement(
"SELECT * FROM categorias where descricao = ?");
        pstmt.setString(1,descricao);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()){
            objCategoria = new Categoria();
            objCategoria.setCodigo(rs.getInt("codigo"));
            objCategoria.setDescricao(rs.getString("descricao"));
        }
        return objCategoria;
}

public Produto Obtem(int codigo) throws SQLException
    {
        Conexao conexao = new Conexao();
        Produto objProduto = null;

        PreparedStatement pstmt = conexao.getConexao().prepareStatement("SELECT * FROM produtos where codigo = ?");
        pstmt.setInt(1,codigo);

        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            objProduto = new Produto();
            objProduto.setCodigo(rs.getInt("codigo"));
            objProduto.setDescricao(rs.getString("descricao"));
            objProduto.setQuantidade(rs.getInt("qtde"));
            objProduto.setPreco_custo(rs.getFloat("preco_custo"));
            objProduto.setPreco_venda(rs.getFloat("preco_venda"));
        }
        return objProduto;
}    

public Vector Pesquisar(String arg) throws SQLException
    {
        Conexao conexao = new Conexao();
        Vector linhas = new Vector();

        PreparedStatement pstmt = conexao.getConexao().prepareStatement("SELECT * FROM produtos where descricao like %'?'%");
        pstmt.setString(1,arg);

        ResultSet rs = pstmt.executeQuery();

            // percorre a lista de resultado da query:
            while(rs.next())
            {
                Produto objProduto = new Produto();
                objProduto.setCodigo(rs.getInt("codigo"));
                objProduto.setDescricao(rs.getString("descricao"));
                objProduto.setQuantidade(rs.getInt("qtde"));
                objProduto.setPreco_custo(rs.getFloat("preco_custo"));
                objProduto.setPreco_venda(rs.getFloat("preco_venda"));

                Vector novalinha = new Vector();
                novalinha.addElement(objProduto.getCodigo());
                novalinha.addElement(objProduto.getDescricao());
                novalinha.addElement(objProduto.getQuantidade());
                novalinha.addElement(objProduto.getPreco_custo());
                novalinha.addElement(objProduto.getPreco_venda());
                linhas.addElement(novalinha);
            }
        return linhas;
}

public boolean Exclui(int codigo) throws SQLException
    {
        Conexao conexao = new Conexao();
        
        PreparedStatement pstmt = conexao.getConexao().prepareStatement("DELETE FROM produtos where codigo = ?");
        pstmt.setInt(1,codigo);
        int resultado = pstmt.executeUpdate();
        pstmt.close();
        if (resultado > 0) return true;
        else return false;
}
    
public boolean Inclui(int codigo, Telefone objTelefone) throws SQLException
    {
        Conexao conexao = new Conexao();
        
        PreparedStatement pstmt = conexao.getConexao().prepareStatement
        ("INSERT INTO produtos (codigo, descricao, qtde, preco_custo, preco_venda)" +
                " VALUES (?,?,?,?,?)");
        pstmt.setInt(1, codigo);
        pstmt.setInt(2, objTelefone.getDdd());
        pstmt.setString(3, objTelefone.getTelefone());
        pstmt.setInt(4, objTelefone.getTipo());
        
        int resultado = pstmt.executeUpdate();
        pstmt.close();
        if (resultado > 0) return true;
        else return false;
}
    
public boolean Altera(Produto objProduto) throws Exception
    {
        Conexao conexao = new Conexao();
        
        PreparedStatement pstmt = conexao.getConexao().prepareStatement("UPDATE produtos SET descricao = ?, qtde = ?, preco_custo = ?, preco_venda = ? WHERE codigo = ?");
        pstmt.setString(1, objProduto.getDescricao());
        pstmt.setInt(2, objProduto.getQuantidade());
        pstmt.setFloat(3, objProduto.getPreco_custo());
        pstmt.setFloat(4, objProduto.getPreco_venda());
        pstmt.setInt(5, objProduto.getCodigo());
        int resultado = pstmt.executeUpdate();
        pstmt.close();
        if (resultado > 0) return true;
        else return false;
}    
}
