
package Student_Registration_system;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Databaseconnection {
final static String JDBC_DRIVER="com.mysql.jdbc.Driver";
final static String BD_URL="jdbc:mysql://localhost:3306/student_registration"; 
   
final static String USER="root" ;
final static String PASS=""; 

public static   Connection connection(){
    try{
        Class.forName(JDBC_DRIVER);
            Connection connection= (Connection) DriverManager.getConnection(BD_URL,USER,PASS); 
            return connection;
    }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
            return null;
}
      
}  
}
