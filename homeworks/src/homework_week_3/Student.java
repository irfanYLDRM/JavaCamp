package homework_week_3;

public class Student extends User {

	private String firstName;
	private String lastName;
	private String school;
	private String department;
	
	public Student() {
		
	}

	public Student(String firstName, String lastName, String school, String department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.school = school;
		this.department = department;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
}
