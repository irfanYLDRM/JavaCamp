package homework_week_3;

public class InstructorManager extends UserManager {

	public void add(Instructor instructor) {
		System.out.println("Kullanıcı eklendi: " + instructor.getFirstName() + " " + instructor.getLastName());
	}
	
	public void update(Instructor instructor) {
		System.out.println("Kullanıcı güncellendi: " + instructor.getFirstName() + " " + instructor.getLastName());
	}
}
