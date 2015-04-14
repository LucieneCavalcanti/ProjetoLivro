package br.edu.fatecriopreto.loja.data;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class Conexao {
    private static Connection conexao;
    private static String url;
    private static String driver;
    private static final String PROP_FILE = "conexao.properties";

    public Conexao() throws IOException, SQLException, ClassNotFoundException {
            Properties props = new Properties();
            props.load(Conexao.class.getResourceAsStream(PROP_FILE));
            url = props.getProperty("url");
            driver = props.getProperty("driver");
            Class.forName(driver);
            conexao = DriverManager.getConnection(url);
            //System.out.println("conexao ok");
    }
    
    protected Connection getConexao() throws SQLException
    {
           return conexao;
    }
    
    protected void fechaConexao() throws SQLException{
            conexao.close();
    }
    
}
