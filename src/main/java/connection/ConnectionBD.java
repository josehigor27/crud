package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBD {
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "biscoito";
    private static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/db_produto";


    public static Connection createConnection(){
        try{
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
        }catch (SQLException|ClassNotFoundException e){
            throw new RuntimeException("Erro: ",e);
        }
    }

    public static void closeConnection(Connection conn){
        try {
            if (conn !=null)
                conn.close();
        }catch (SQLException e){
            System.out.println("ERRO" + e);
        }
    }

}
