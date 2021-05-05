package homework_week_3;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("��renci");
		student.setLastName("��RENC�");
		student.setEmail("ogrenci@kodlama.io");
		student.setAddress("Ankara");
		student.setSchool("Ankara �niversitesi");
		student.setDepartment("Yaz�l�m M�hendisli�i");
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("E�itmen");
		instructor.setLastName("E��TMEN");
		instructor.setEmail("egitmen@kodlama.io");
		instructor.setAddress("�stanbul");
		instructor.setEducation("Hacettepe �niversitesi - Bilgisayar M�hendisli�i");
		instructor.setInfo("�u,Bu, O sertifikalar�na sahip ve �unlar, Bunlar, Onlar tecr�belerine sahip");
		
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		studentManager.delete(student);
		instructorManager.delete(instructor);
		
		studentManager.add(student);
		instructorManager.add(instructor);
		
		studentManager.update(student);
		instructorManager.update(instructor);
		
		studentManager.log(student);
		instructorManager.log(instructor);

	}

}
