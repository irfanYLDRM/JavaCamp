package eCommerceDemo.core.adapters;

import eCommerceDemo.GoogleUser.JGoogleUser;
import eCommerceDemo.core.abstracts.ExternalRegistrationService;
import eCommerceDemo.entities.concretes.User;

public class GoogleRegistrationAdapter implements ExternalRegistrationService{

	@Override
	public User getUser(String email) {
		JGoogleUser googleUser = new JGoogleUser();
		User user = new User();
		user = googleUser.getGoogleUser(email);
		return user;
	}

}
