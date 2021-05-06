package eCommerceDemo.core.abstracts;

public interface CheckUserInformationService {
	
	boolean checkFirstName(String firstName);
	boolean checkLastName(String lastName);
	boolean checkEmail(String email);
	boolean checkPassword(String password);

}
