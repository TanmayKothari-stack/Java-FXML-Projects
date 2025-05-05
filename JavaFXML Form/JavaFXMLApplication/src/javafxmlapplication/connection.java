package javafxmlapplication;

import java.sql.*;

public class connection {

    public static Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "";

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            //System.out.println("Connected to database sucessfully");

            return conn;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
