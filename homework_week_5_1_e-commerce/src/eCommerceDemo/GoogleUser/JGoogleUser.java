package eCommerceDemo.GoogleUser;

import eCommerceDemo.entities.concretes.User;

public class JGoogleUser {

	public User getGoogleUser(String email) {
		User user = new User();
		user.setEmail(email);
		user.setFirstName("�rfan");
		user.setLastName("Y�ld�r�m");
		return user;
	}
}
