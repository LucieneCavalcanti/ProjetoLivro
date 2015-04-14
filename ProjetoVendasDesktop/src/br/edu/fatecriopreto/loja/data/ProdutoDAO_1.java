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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import br.edu.fatecriopreto.loja.model.Categoria;

/**
 *
 * @author Administrador
 */
public class ProdutoDAO extends Conexao{
    
    /** Creates a new instance of ClienteDAO */
    public ProdutoDAO() {
      //  super("jdbc:odbc:odbcBdJava", "sun.jdbc.odbc.JdbcOdbcDriver");
        //depois vai pegar de um arquivo de parâmetros
    }

public ResultSet Relatorio()
    {
               
        Vector linhas = new Vector();
        ResultSet rs = null;
        
        try
        {
            PreparedStatement pstmt = getConexao().prepareStatement("SELECT * FROM produtos order by codigo");
            rs = pstmt.executeQuery();
       
        }
        catch(SQLException ex){
            System.out.println("erro ao listar");
       } finally {
           fechaConexao();
       }
        return rs;
 }
       
public Vector Lista()
    {
        Vector linhas = new Vector();
            
        try
        {
            PreparedStatement pstmt = getConexao().prepareStatement("SELECT * FROM produtos order by codigo");
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
        finally {
           fechaConexao();
       }
        return linhas;
}
    
 
       
public Produto Obtem(int codigo) throws SQLException
    {
        Produto objProduto=null;

        PreparedStatement pstmt = getConexao().prepareStatement(
                "SELECT produto.codigo, produto.descricao, produto.quantidade, produto.preco_custo," +
                " produto.preco_venda, produto.data, produto.codigo_categoria, categoria.descricao as categoria FROM produto, categoria" +
                " where produto.codigo_categoria = categoria.codigo and produto.codigo = ?");
        pstmt.setInt(1,codigo);

        ResultSet rs = pstmt.executeQuery();

        if (rs.next()){
            objProduto = new Produto();
            objProduto.setCodigo(rs.getInt("codigo"));
            objProduto.setDescricao(rs.getString("descricao").trim());
            objProduto.setQuantidade(rs.getInt("quantidade"));
            objProduto.setPreco_custo(rs.getFloat("preco_custo"));
            objProduto.setPreco_venda(rs.getFloat("preco_venda"));
            objProduto.setData(rs.getDate("data"));
            objProduto.setCategoria(new Categoria(rs.getInt("codigo_categoria"),rs.getString("categoria").trim()));
            
        }



        return objProduto;
}    

public Vector Pesquisar(String arg) throws SQLException
    {
        
        Vector linhas = new Vector();

        PreparedStatement pstmt = getConexao().prepareStatement("SELECT * FROM produtos where descricao like '%"+ arg +"%';");
        //pstmt.setString(1,arg);

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
                
        PreparedStatement pstmt = getConexao().prepareStatement("DELETE FROM produtos where codigo = ?");
        pstmt.setInt(1,codigo);
        int registros = pstmt.executeUpdate();

        if (registros == 0){
            return true; }
        else {
            return false; }

   }
    
public boolean Inclui(Produto objProduto) throws SQLException
    {
                
        PreparedStatement pstmt = getConexao().prepareStatement
        ("INSERT INTO produto (descricao, quantidade, preco_custo, preco_venda, codigo_categoria, data)" +
                " VALUES (?,?,?,?,?,?)");
        pstmt.setString(1, objProduto.getDescricao());
        pstmt.setInt(2, objProduto.getQuantidade());
        pstmt.setFloat(3, objProduto.getPreco_custo());
        pstmt.setFloat(4, objProduto.getPreco_venda());
        pstmt.setInt(5, objProduto.getCategoria().getCodigo());
        pstmt.setTimestamp(6, new java.sql.Timestamp(objProduto.getData().getTime()));
        int registros = pstmt.executeUpdate();
        pstmt.close();
        if (registros == 1){
            return true; }
        else {
            return false; }
    
}
    
public boolean Altera(Produto objProduto) throws Exception
    {
              
        PreparedStatement pstmt = getConexao().prepareStatement("UPDATE produtos SET descricao = ?, qtde = ?, preco_custo = ?, preco_venda = ? WHERE codigo = ?");
        pstmt.setString(1, objProduto.getDescricao());
        pstmt.setInt(2, objProduto.getQuantidade());
        pstmt.setFloat(3, objProduto.getPreco_custo());
        pstmt.setFloat(4, objProduto.getPreco_venda());
        pstmt.setInt(5, objProduto.getCodigo());
        int resultado = pstmt.executeUpdate();
        pstmt.close();
        if (resultado == 0)
            return false;
        else
            return true;
     
}
}