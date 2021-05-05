package Abstract;

public abstract class User {
	String firstName;
	String lastName;
	String nationalId;
	int yearOfBirth;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getNationalId() {
		return nationalId;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
}
