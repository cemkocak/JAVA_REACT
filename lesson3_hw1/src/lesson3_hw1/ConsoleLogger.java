package lesson3_hw1;

public class ConsoleLogger extends BaseLogger{

	public void log(String message)
	{
		System.out.println("Looged to console: " + message);
	}
}
