
package electronic_storee;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.activation.DataSource;


public class BD {
    
    
    public static String servername ="localhost";
    public static String username = "root";
    public static String dbname ="product_db";
    public static Integer portnumber = 3306;
    public static String password = "";
    
    public static Connection getConnection(){
         
        MysqlDataSource ds = new MysqlDataSource();
      ds.setServerName(servername);
      ds.setUser(username);
      ds.setDatabaseName(dbname);
      ds.setPortNumber( portnumber);
      ds.setPassword(password);
      
        try {
            return ds.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
      
      
        
    }   
    
    
}
