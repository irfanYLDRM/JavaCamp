package homework_week_3;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Öðrenci");
		student.setLastName("ÖÐRENCÝ");
		student.setEmail("ogrenci@kodlama.io");
		student.setAddress("Ankara");
		student.setSchool("Ankara Üniversitesi");
		student.setDepartment("Yazýlým Mühendisliði");
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Eðitmen");
		instructor.setLastName("EÐÝTMEN");
		instructor.setEmail("egitmen@kodlama.io");
		instructor.setAddress("Ýstanbul");
		instructor.setEducation("Hacettepe Üniversitesi - Bilgisayar Mühendisliði");
		instructor.setInfo("Þu,Bu, O sertifikalarýna sahip ve Þunlar, Bunlar, Onlar tecrübelerine sahip");
		
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
