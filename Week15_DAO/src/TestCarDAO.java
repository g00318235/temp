
public class TestCarDAO {
	public static void main(String[]	args)	{
		CarDAO	carDAO	=	new CarDAO();
		Car	car	=	new Car();
		car.setId(3);
		car.setRegNum("07 MO 5575");
		car.setMake("Ford");
		car.setEngineCC(1995);
		
		carDAO.insert(car);
	}
}
