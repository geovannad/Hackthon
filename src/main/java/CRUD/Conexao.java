package CRUD;

import java.sql.*;

public class Conexao {

    protected Connection conn;
    protected PreparedStatement pstmt;
    protected ResultSet rs;

    public boolean conectar(){
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dppicpay", "postgres", "1234");
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
            return false;
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return false;
        }
        return true;
    }

    public void desconectar(){
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        }catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
}
