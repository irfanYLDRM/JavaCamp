package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new EmailLogger(),new SmsLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer customer = new Customer(1,"Müþteri", "MÜÞTERÝ");
		customerManager.add(customer);

	}

}
