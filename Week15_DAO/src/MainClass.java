import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


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

			String sql= "update car" + "Regnum = '07 MO 7735' where id = 3";
			PreparedStatement ps = conn.prepareStatement(sql);
			 ps.executeUpdate();
			
			System.out.println("good");
			
		}catch (ClassNotFoundException cnfe){
			throw new RuntimeException(cnfe);
		} catch (SQLException sqle) {
			throw new RuntimeException(sqle);
		}
	}

}
