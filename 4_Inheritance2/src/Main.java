
public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();
		
		FileLogger fileLogger = new FileLogger();
		DatabaseLogger databaseLogger = new DatabaseLogger();
		EmailLogger emailLogger = new EmailLogger();
		
		customerManager.add(emailLogger);
		customerManager.add(fileLogger);
		customerManager.add(databaseLogger);
		
	}

}
