
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;



public class MyConnection {
    static final String JDBC_Driver="com.mysql.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://localhost/inventory_management_system";
    static final String USER="root";
    static final String PASS="";
    
    
    static Connection connection(){
        try {
            Class.forName(JDBC_Driver);
            Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);
            
            return conn;
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Server Not Connected  "+ex);
        } 
        
        
        
        return null;
    }
    
    
    
}
