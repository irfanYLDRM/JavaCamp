package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	public boolean CheckIfRealPerson(Customer customer) {
		System.out.println("Mernis doðrulamasý yapýldý");
		return true;
	};
}
