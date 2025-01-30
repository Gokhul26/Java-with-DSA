package JDBC;
//java -cp ".:/home/gokhul/Desktop/Java/JDBC/lib/mysql-connector-java.jar:/home/gokhul/.config/Code/User/workspaceStorage/90855e1ea9a3bc5d255ddc582f51d125/redhat.java/jdt_ws/Java_53af5007/bin" JDBC.jdbc2

import java.util.*;
import java.sql.*;
public class jdbc2 {
 public static void main(String[] args) {
    Connection con;

    ResultSet rs;

    Statement st;

    int num = 0, age= 0, ch = 0,i = 0;

    String nam;

      try {

          Class.forName("com.mysql.cj.jdbc.Driver");

      } catch (ClassNotFoundException e) {
          e.printStackTrace();
      }

    Scanner sc = new Scanner(System.in);
    do {
        System.out.println("\t\t1.Create");
        System.out.println("\t\t2.Add");
        System.out.println("\t\t3.Modify");
        System.out.println("\t\t4.Display");
        System.out.println("\t\t5.Delete");
        System.out.println("\t\t6.Exit");
        System.out.print("\t\t\nEnter your code: ");
        ch = sc.nextInt();
        switch(ch) {
          case 1:
            System.out.println("Table Creation");
            try {
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Goks","root","root");
                st=con.createStatement();
                i=st.executeUpdate("create table fresher(ecode int primary key,name varchar(50),age int)");
                st.close();
                con.close();
            }
            catch(Exception e) {
                e.printStackTrace(); 
                System.out.println("Table Creation Error!");
          }
          break;
      case 2:
      System.out.println("Add record: ");
      try {
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Goks", "root", "root");
  
          System.out.print("Enter Emp No: ");
          num = sc.nextInt();
          sc.nextLine(); // Consume newline
  
          System.out.print("Enter Emp name: ");
          nam = sc.nextLine();
  
          System.out.print("Enter Age: ");
          age = sc.nextInt();
          
          // Using PreparedStatement to avoid SQL syntax errors
          String insertQuery = "INSERT INTO fresher (ecode, name, age) VALUES (?, ?, ?)";
          PreparedStatement pstmt = con.prepareStatement(insertQuery);
          pstmt.setInt(1, num);
          pstmt.setString(2, nam);
          pstmt.setInt(3, age);
          
          pstmt.executeUpdate();
          System.out.println("Record inserted successfully!");
          
          pstmt.close();
          con.close();
      } catch (Exception e) {
          System.out.println("Error inserting record: " + e.getMessage());
      }
      break;
  
      
        }
        }while(ch < 6);
 }
}




// package JDBC.Project;

// import java.util.*;
// import java.sql.*;

// public class jdbc2 {
//     public static void main(String[] args) {
//         Connection con;
//         Statement st;
//         int ch = 0;
//         Scanner sc = new Scanner(System.in);

//         // Load MySQL JDBC Driver
//         try {
//             Class.forName("com.mysql.cj.jdbc.Driver");
//         } catch (ClassNotFoundException e) {
//             e.printStackTrace();
//         }

//         do {
//             System.out.println("\t\t1. Create Table");
//             System.out.println("\t\t2. Add Data");
//             System.out.println("\t\t3. Modify Data");
//             System.out.println("\t\t4. Display Data");
//             System.out.println("\t\t5. Delete Data");
//             System.out.println("\t\t6. Exit");
//             System.out.print("\t\tEnter your choice: ");
//             ch = sc.nextInt();
//             sc.nextLine(); // Consume newline

//             switch (ch) {
//                 case 1:
//                     System.out.println("Creating Table...");
//                     try {
//                         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Goks", "root", "root");
//                         st = con.createStatement();
//                         String sql = "CREATE TABLE IF NOT EXISTS fresher(ecode INT PRIMARY KEY, name VARCHAR(50), age INT)";
//                         st.executeUpdate(sql);
//                         System.out.println("Table Created Successfully!");
//                         st.close();
//                         con.close();
//                     } catch (SQLException e) {
//                         e.printStackTrace();
//                         System.out.println("Table Creation Error!");
//                     }
//                     break;

//                 case 6:
//                     System.out.println("Exiting...");
//                     break;

//                 default:
//                     System.out.println("Invalid choice! Please select a valid option.");
//             }
//         } while (ch != 6);

//         sc.close();
//     }
// }
