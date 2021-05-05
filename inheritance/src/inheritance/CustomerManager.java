package inheritance;

import java.util.Iterator;

public class CustomerManager {

	public void add(Customer customer) {
		
	}
	
	//bulk insert
	public void addMultiple(Customer[] customers) {
		for(Customer customer : customers) {
			add(customer);
		}
	}
}
