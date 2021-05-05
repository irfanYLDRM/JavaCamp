package homework_week_3;

public class InstructorManager extends UserManager {

	public void add(Instructor instructor) {
		System.out.println("Kullanýcý eklendi: " + instructor.getFirstName() + " " + instructor.getLastName());
	}
	
	public void update(Instructor instructor) {
		System.out.println("Kullanýcý güncellendi: " + instructor.getFirstName() + " " + instructor.getLastName());
	}
}
