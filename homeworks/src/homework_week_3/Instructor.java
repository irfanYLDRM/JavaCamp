package homework_week_3;

public class Instructor extends User {

	private String firstName;
	private String lastName;
	private String education;
	private String info;
	
	public Instructor() {
		
	}

	public Instructor(String firstName, String lastName, String education, String info) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.education = education;
		this.info = info;
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

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
}
