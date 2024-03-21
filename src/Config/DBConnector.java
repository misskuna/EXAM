
package Config;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBConnector {
     Connection cn;
     public DBConnector(){
           try{
            cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kyutq", "root","");
        }catch(SQLException er){System.out.println("Cannot Connect To DB"+er.getMessage());}
        
        
    }
    public ResultSet getData(String sql) throws SQLException{
        Statement st =(Statement) cn.createStatement(); ResultSet rs =st.executeQuery(sql); return rs;

     }
    
}
