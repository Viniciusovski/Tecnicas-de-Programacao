package exemplo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conecta {
    
    public static Connection getConexao(){
        Connection con = null;
        try{
            String serverName = "localhost";
            String mydatabase = "alunos";
            String username = "usuario";
            String password = "senha123";
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            
            String url = "jdbc:mysql://"+serverName+"/"+mydatabase;
            con = DriverManager.getConnection(url, username, password);
        }catch(ClassNotFoundException e){
            System.out.println("Driver não foi encontrado "+ e.toString());
        }catch(SQLException e){
            System.out.println("Erro ao conectar com o BD "+e.toString());
        }
        return con;
    }
    
}
