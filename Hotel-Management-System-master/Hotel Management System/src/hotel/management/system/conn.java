/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;




import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
     public conn() {
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver"); // Ensure driver is loaded
            c = DriverManager.getConnection("jdbc:mysql:///hotelmanagementsystem", "root", "Prabh@kar23");
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }  
}  

//public class conn {
//    Connection c;
//    Statement s;
//
//   
//    }
//}
