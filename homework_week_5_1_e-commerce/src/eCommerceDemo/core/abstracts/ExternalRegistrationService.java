package eCommerceDemo.core.abstracts;

import eCommerceDemo.entities.concretes.User;

public interface ExternalRegistrationService {
	
	User getUser(String email);
}
