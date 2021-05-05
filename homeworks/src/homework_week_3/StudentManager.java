package homework_week_3;

public class StudentManager extends UserManager {

	public void add(Student student) {
		System.out.println("Kullan�c� eklendi: " + student.getFirstName() + " " + student.getLastName());
	}
	
	public void update(Student student) {
		System.out.println("Kullan�c� g�ncellendi: " + student.getFirstName() + " " + student.getLastName());
	}
	
	@Override
	public void log(User user) {
		System.out.println("��renciye �zel log konfig�rasyonu.");
	}
	
}
