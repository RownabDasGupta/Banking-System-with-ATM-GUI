package bank.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionWithDB {
    Connection c;
    Statement s;
    
    public ConnectionWithDB() {
        try {
//            Class.forName(com.mysql.cj.jdbc.Driver);
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystemwithatm", "root", "root"); //or jdbc:mysql:///banksystemwithatm is same
            s = c.createStatement();
        }
        catch(Exception ex) {
           System.out.println(ex); 
        }
    }
}
