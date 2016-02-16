
public class TestMain {

	public static void main(String[] args) {
		BarDAO barDAO = new BarDAO();
		Bar bar = barDAO.findById(3);
		System.out.println(bar);
	}
}
