package amazen;
import java.sql.*;
public class testc {

	public static void main(String[] args) throws Exception{
		Statement stmt =null;
		Class.forName ("org.h2.Driver");
		Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
		stmt = conn.createStatement(); 
        stmt = conn.createStatement(); 
        String sql =  "CREATE TABLE   REGISTRATION " + 
                "(id INTEGER not NULL, " + 
                " first VARCHAR(255), " +  
                " last VARCHAR(255), " +  
                " age INTEGER, " +  
                " PRIMARY KEY ( id ))";  
             stmt.executeUpdate(sql);  
        stmt.executeUpdate(sql);
        stmt.close();
        conn.close();        
	}
}
