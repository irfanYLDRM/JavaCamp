package homework_week_3;

public class StudentManager extends UserManager {

	public void add(Student student) {
		System.out.println("Kullanýcý eklendi: " + student.getFirstName() + " " + student.getLastName());
	}
	
	public void update(Student student) {
		System.out.println("Kullanýcý güncellendi: " + student.getFirstName() + " " + student.getLastName());
	}
	
	@Override
	public void log(User user) {
		System.out.println("Öðrenciye özel log konfigürasyonu.");
	}
	
}
