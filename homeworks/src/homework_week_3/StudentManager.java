package homework_week_3;

public class StudentManager extends UserManager {

	public void add(Student student) {
		System.out.println("Kullanıcı eklendi: " + student.getFirstName() + " " + student.getLastName());
	}
	
	public void update(Student student) {
		System.out.println("Kullanıcı güncellendi: " + student.getFirstName() + " " + student.getLastName());
	}
	
	@Override
	public void log(User user) {
		System.out.println("Öğrenciye özel log konfigürasyonu.");
	}
	
}
