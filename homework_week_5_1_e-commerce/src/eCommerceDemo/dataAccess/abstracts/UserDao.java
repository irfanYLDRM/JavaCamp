package eCommerceDemo.dataAccess.abstracts;

import java.util.List;

import eCommerceDemo.entities.concretes.User;

public interface UserDao {
	
	boolean add(User user);
	void delete(User user);
	void update(User user);
	User get(int id);
	List<User> getAll();
	boolean getEmail(String email);
	String login(String email, String password);

}
