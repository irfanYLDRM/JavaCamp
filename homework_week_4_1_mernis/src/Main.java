import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(
			1,
			"�rfan",
			"Y�ld�r�m",
			1975,
			"47596325846"
		));
		Customer customer = new Customer(1,"�rfan","Y�ld�r�m",1992,"58585858584");

	}

}
