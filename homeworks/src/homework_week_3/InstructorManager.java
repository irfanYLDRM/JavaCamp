package homework_week_3;

public class InstructorManager extends UserManager {

	public void add(Instructor instructor) {
		System.out.println("Kullan�c� eklendi: " + instructor.getFirstName() + " " + instructor.getLastName());
	}
	
	public void update(Instructor instructor) {
		System.out.println("Kullan�c� g�ncellendi: " + instructor.getFirstName() + " " + instructor.getLastName());
	}
}
