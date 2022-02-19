package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] logger) {
		super();
		this.loggers = logger;
	}

	public void add(Customer customer ) {
		System.out.println("Müşteri eklendi : " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
	}

	public void delete(Customer customer ) {
		System.out.println("Müşteri silindi : " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());

	}
	
}
