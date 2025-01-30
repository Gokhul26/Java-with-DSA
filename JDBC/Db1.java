package JDBC;

import java.sql.*;


public class Db1 {
    public static void main(String[] args) {
        Connection connection ;
        Statement statement;
        ResultSet resultSet;

        
        // Class.forName() should be within a try-catch block
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //oracle.jdbc.driver.OracleDriver
        //com.microsoft.sqlserver.jdbc.SQLServerDriver
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Pentonic", "root", "root");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from Batch3");
            int i = 0;
            while(resultSet.next()){
                System.out.println(i + "Register Number : " + resultSet.getInt(1) + "Student Name : " + resultSet.getString(2) + "City : " + resultSet.getString(3));
                i++;
            }
            statement.close();//after completing our process, close the connection & statement.
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
