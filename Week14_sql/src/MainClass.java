import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class MainClass {



	public static void main(String[] args) {


		String dbHost = "localhost";
		String dbDatabase = "softdev2";
		String dbUser = "root";
		String dbPassword = "";
		try {
			Class.forName("com.mysql.jdbc.Driver");

			String connectionUrl = "jdbc:mysql://" + dbHost
					+ "/" + dbDatabase
					+ "?user=" + dbUser
					+ "&password=" + dbPassword;

			Connection conn = DriverManager.getConnection(connectionUrl);

			String sql = "update student " + "set firstName = 'Jane' where id = 2";
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.executeUpdate();
			
			conn.close();
			System.out.println("good"); 
		}catch (ClassNotFoundException cnfe){
			throw new RuntimeException(cnfe);
		} catch (SQLException sqle) {
			throw new RuntimeException(sqle);
		}
	}

}
