import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CarDAO {
	final String username="root";
	final String password="";
	final String url="jdbc:mysql://localhost/";
	final String db = "softdev2";
	
	final String connectionUrl= url+""+db+"?"
			+ "user="+username+"&"
			+ "password="+password+"";
	
	public void insert (Car car){
		try {
			// register the driver
			Class.forName("com.mysql.jdbc.Driver");
			// get connection
			
			//System.out.println(connectionUrl);
			
			Connection connection = DriverManager.getConnection(connectionUrl);
					
			String sql= "insert into car (id, regnum, make, engineCC) values (?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setLong(1, car.getId());
			ps.setString(2, car.getRegNum());
			ps.setString(3, car.getMake());
			ps.setInt(4, car.getEngineCC());
			 ps.executeUpdate();
			
			
			 connection.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException sqle){
			sqle.printStackTrace();
		}
	}
	public void update (Car car){
		
	}
	public void delete(long id){

	}
	public void delete(Car car){

	}
	public Car findById (long id){
		Car car = null;
		return car;
	}
	public List<Car> getAll(){
		List<Car> car = new ArrayList<Car>();
		return car;
	}
	public Car findByReg (int reg){
		Car car = null;
		return car;
	}
	public List<Car> getAllByMake(String make){
		List<Car> car = new ArrayList<Car>();
		return car;
	}
}	
