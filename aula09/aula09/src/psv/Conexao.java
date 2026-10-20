package psv;

import java.sql.*;

public class Conexao {
    public static Connection abirConexao() {
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            /* Quando tentei compilar ele dava problema com o newInstance() 
             disse que isso era um método descontinuado
             Pesquisei e disse que foi descontinuado no Java 9*/

            String url = "";
            url += "jdbc:mysql://127.0.0.1/estacionamento?";
            url += "user=root&password=";

            con = DriverManager.getConnection(url);
            System.out.println("Aberto");
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } catch(ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return con;
    }

    public static void fecharConexao(Connection con) {
        try {
            con.close();
            System.out.println("Conexão fechada.");
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } 
    }
    public static void main(String[] args) {
        System.out.println(abirConexao());
    }
}
