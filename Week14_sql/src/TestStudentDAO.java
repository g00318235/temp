
public class TestStudentDAO {

	public static void main(String[] args) {
		StudentDAO studentDAO = new StudentDAO();
		
		Student student = new Student();
		student.setId(3);
		student.setName("Mike");
		student.setAge(35);
		
		studentDAO.insert(student);
	}
	
}
