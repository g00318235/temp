import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class BarDAO {
	final String username="root";
	final String password="";
	final String url="jdbc:mysql://localhost/";
	final String db = "softdev2";

	final String connectionUrl= url+""+db+"?"
			+ "user="+username+"&"
			+ "password="+password+"";

	public void insert (Bar bar){

		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection(connectionUrl);

			String sql= "insert into bar (id, name, price, value, alert) values (?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setLong(1, bar.getId());
			ps.setString(2, bar.getName());
			ps.setInt(3, bar.getPrice());
			ps.setInt(4, bar.getValue());
			ps.setInt(5, bar.getAlert());
			ps.executeUpdate();


			connection.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException sqle){
			sqle.printStackTrace();
		}
	}
	
	public void update (Bar bar){

		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection(connectionUrl);

			String sql= "update bar set name =?, price =?, value =?, alert =? Where id = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setString(1, bar.getName());
			ps.setInt(2, bar.getPrice());
			ps.setInt(3, bar.getValue());
			ps.setInt(4, bar.getAlert());
			ps.setLong(5, bar.getId());
			ps.executeUpdate();


			connection.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException sqle){
			sqle.printStackTrace();
		}
	}
	
	public void delete (Bar bar){
		
		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection(connectionUrl);

			String sql= "delete from bar Where id = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setLong(1, bar.getId());
			ps.executeUpdate();


			connection.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException sqle){
			sqle.printStackTrace();
		}
	}

	public Bar findById(int i) {
		
		return null;
	}
}

