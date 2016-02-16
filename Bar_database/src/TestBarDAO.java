
public class TestBarDAO {
	public static void main(String[]	args)	{
		BarDAO	barDAO	=	new BarDAO();
		Bar	bar	=	new Bar();
		bar.setId(3);
		bar.setName("Vodka");
		bar.setPrice(380);
		bar.setValue(50);
		bar.setAlert(10);
		
		barDAO.insert(bar);
	}
}
