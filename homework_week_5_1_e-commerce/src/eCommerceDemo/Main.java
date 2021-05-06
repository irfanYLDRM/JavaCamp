package eCommerceDemo;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.business.concretes.UserManager;
import eCommerceDemo.core.adapters.ConfirmEmailAdapter;
import eCommerceDemo.core.adapters.GoogleRegistrationAdapter;
import eCommerceDemo.core.concretes.CheckUserInformationManager;
import eCommerceDemo.dataAccess.concretes.XUserDao;
import eCommerceDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) throws Exception {

		UserService userService = new UserManager(new XUserDao(), new CheckUserInformationManager(),
				new ConfirmEmailAdapter(),new GoogleRegistrationAdapter());
		User user = new User();
		user.setFirstName("Ýrfan");
		user.setLastName("Yýldýrým");
		user.setEmail("irfan@irfan.com.tr");
		user.setPassword("123456");
		userService.add(user);
		userService.addWithGoogle(user.getEmail());
		userService.login(user.getEmail(), user.getPassword());

	}

}
