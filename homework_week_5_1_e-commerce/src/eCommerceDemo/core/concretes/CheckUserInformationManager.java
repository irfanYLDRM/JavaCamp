package eCommerceDemo.core.concretes;

import java.util.regex.Pattern;

import eCommerceDemo.core.abstracts.CheckUserInformationService;

public class CheckUserInformationManager implements CheckUserInformationService {

	private static final String emailPattern = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	
	@Override
	public boolean checkFirstName(String firstName) {
		if(firstName.length()<2) {
			System.out.println("Kullanýcý adý en az iki karakterden oluþmalýdýr.");
			return false;
		}else {
			return true;
		}
	}

	@Override
	public boolean checkLastName(String lastName) {
		if(lastName.length()<2) {
			System.out.println("Kullanýcý soyismi en az iki karakterden oluþmalýdýr.");
			return false;
		}else {
			return true;
		}
	}

	@Override
	public boolean checkEmail(String email) {
		Pattern pattern = Pattern.compile(emailPattern, Pattern.CASE_INSENSITIVE);
		if(pattern.matcher(email).find()) {
			return true;
		}else {
			System.out.println("Email adresinizi kontrol ediniz.");
			return false;
		}
	}

	@Override
	public boolean checkPassword(String password) {
		if(password.length()<6) {
			System.out.println("Parola en az 6 karakterden oluþmalýdýr.");
			return false;
		}else {
			return true;
		}
	}

}
