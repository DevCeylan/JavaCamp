
public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {new SmsLogger(), new DatabaseLogger(), new FileLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer customer = new Customer(1,"Mehmet","Ceylan");
		
		customerManager.add(customer);
	}

}
