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
    private static final String PROP_FILE = "conexao.properties";

//    public Conexao() throws IOException, SQLException, ClassNotFoundException {
//            Properties props = new Properties();
//            props.load(Conexao.class.getResourceAsStream(PROP_FILE));
//            url = props.getProperty("url");
//            driver = props.getProperty("driver");
//            Class.forName(driver);
//            conexao = DriverManager.getConnection(url,"sa","dba");
//            //System.out.println("conexao ok");
//    }
    
    public Conexao() throws Exception {
        Class.forName("net.sourceforge.jtds.jdbc.Driver");
        String url = "jdbc:sql......";
        conexao = DriverManager.getConnection(url,"sa","dba");
    }
    protected static Connection getConexao() throws SQLException
    {
           return conexao;
    }
    
    protected static void fechaConexao() throws SQLException{
            conexao.close();
    }
    
}
