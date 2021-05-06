package eCommerceDemo.GoogleUser;

import eCommerceDemo.entities.concretes.User;

public class JGoogleUser {

	public User getGoogleUser(String email) {
		User user = new User();
		user.setEmail(email);
		user.setFirstName("Ýrfan");
		user.setLastName("Yýldýrým");
		return user;
	}
}
