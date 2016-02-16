import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class BMainClassGetAll {

	public static void main(String[] args) {
		try {
		// register Driver
		Class.forName("com.mysql.jdbc.Driver");
		//url
		String username="root";
		String password="";
		String url="jdbc:mysql://localhost/"; 
		String db = "softdev2";
		
		String connectionUrl= url+""+db+"?"
				+ "user="+username+"&"
				+ "password="+password+"";
		System.out.println(connectionUrl);
		//make Connection
		Connection connection = DriverManager.getConnection(connectionUrl);
		
		//make sql
		String sql = "select * from student;";
		System.out.println(sql);
		
		//prepare statement 
		PreparedStatement ps = connection.prepareStatement(sql); 
		
		//run prepared statement
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()){
			
		}
		
		}catch(ClassNotFoundException cnfe){
			throw new RuntimeException(cnfe);
		}catch(SQLException sqle){
			throw new RuntimeException(sqle);
		}
	}
}
