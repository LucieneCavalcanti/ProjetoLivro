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
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.JOptionPane;
import br.edu.fatecriopreto.loja.model.Fornecedor;
import br.edu.fatecriopreto.loja.model.Telefone;

/**
 *
 * @author Administrador
 */
public class FornecedorDAO {
    
    /** Creates a new instance of ClienteDAO */
    public FornecedorDAO() {
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
    
 
       
public Produto Obtem(int codigo) throws SQLException
    {
        Conexao conexao = new Conexao();
        Produto objProduto = new Produto();

        PreparedStatement pstmt = conexao.getConexao().prepareStatement("SELECT * FROM produtos where codigo = ?");
        pstmt.setInt(1,codigo);

        ResultSet rs = pstmt.executeQuery();

        rs.next();
        objProduto.setCodigo(rs.getInt("codigo"));
        objProduto.setDescricao(rs.getString("descricao"));
        objProduto.setQuantidade(rs.getInt("qtde"));
        objProduto.setPreco_custo(rs.getFloat("preco_custo"));
        objProduto.setPreco_venda(rs.getFloat("preco_venda"));
        return objProduto;
}    

public Vector Pesquisar(String arg) throws SQLException
    {
        Conexao conexao = new Conexao();
        Vector linhas = new Vector();

        PreparedStatement pstmt = conexao.getConexao().prepareStatement("SELECT * FROM produtos where descricao like '%"+ arg +"%';");
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

public void Exclui(int codigo) throws SQLException
    {
        Conexao conexao = new Conexao();
        
        PreparedStatement pstmt = conexao.getConexao().prepareStatement("DELETE FROM produtos where codigo = ?");
        pstmt.setInt(1,codigo);
        pstmt.executeUpdate();
        pstmt.close();
        JOptionPane.showMessageDialog(null,"Registro exclu�do com sucesso!","Clientes",2);

}
    
public boolean Inclui(Fornecedor objFornecedor) throws SQLException
    {
        Conexao conexao = new Conexao();
        TelefoneDAO DAO = new TelefoneDAO();
        
        System.out.println("inclusao");
        PreparedStatement pstmt = conexao.getConexao().prepareStatement
        ("INSERT INTO produtos (codigo, descricao, qtde, preco_custo, preco_venda)" +
                " VALUES (?,?,?,?,?)");
        pstmt.setInt(1, objFornecedor.getCodigo());
        pstmt.setString(2, objFornecedor.getNome());
        pstmt.setString(3, objFornecedor.getEmail());
        pstmt.setString(4, objFornecedor.getContato());
        
        int resultado = pstmt.executeUpdate();
        pstmt.close();
        if (resultado > 0) {

           Vector<Telefone> telefones = objFornecedor.getTelefones();
            if(!telefones.isEmpty()){
                Enumeration e = telefones.elements();
                while (e.hasMoreElements()) {
                    Telefone objTel =  (Telefone) e.nextElement();
                    DAO.Inclui(objFornecedor.getCodigo(),objTel);
                }
            }
        return true;
        }
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
