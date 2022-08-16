package interfaces;

public class Main {

	public static void main(String[] args) {
		// interfaces 
		System.out.println("---------Interface-----------");
		Logger[] loggers = {new SmsLogger(), new MailLogger(), new DatabaseLogger(), new FileLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer cafer = new Customer (1,"Cafer","AYDIN");
		
		customerManager.add(cafer);
		
	}

}
