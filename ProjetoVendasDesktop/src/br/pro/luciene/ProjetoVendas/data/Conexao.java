package br.pro.luciene.ProjetoVendas.data;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class Conexao {
    private static Connection conexao;
    private static String url;
    private static String driver;
    private static String usuario;
    private static String senha;
    private static final String PROP_FILE = "conexao.properties";

    public Conexao() throws Exception {
            Properties props = new Properties();
            props.load(Conexao.class.getResourceAsStream(PROP_FILE));
            url = props.getProperty("url");
            driver = props.getProperty("driver");
            usuario = props.getProperty("usuario");
            senha = props.getProperty("senha");
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,usuario,senha);
    }
    
//    public Conexao() throws Exception {
//        Class.forName("net.sourceforge.jtds.jdbc.Driver");
//        String url = "jdbc:jtds:sqlserver://WIN-FCVHJ306E61:1433/bdVendas";
//        conexao = DriverManager.getConnection(url,"sa","dba");
//    }
    public static Connection getConexao() throws SQLException
    {
           return conexao;
    }
    
    protected static void fechaConexao() throws SQLException{
            conexao.close();
    }
    
}
