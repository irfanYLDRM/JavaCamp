package eCommerceDemo.business.abstracts;

import eCommerceDemo.entities.concretes.User;

public interface UserService {
	void add(User user);
	void addWithGoogle(String email);
	void login(String email, String password);
}
