package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger() , new DatabaseLogger() , new EmailLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer customer1 = new Customer(1, "Berkin", "Topaloğlu");
		customerManager.add(customer1);
	}

}
