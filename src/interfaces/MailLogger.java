package interfaces;

public class MailLogger implements Logger 
{
	@Override
	public void log(String message) 
	{
		System.out.println("Email log Success! - " + message);
		
	}
	

}
