package lesson3_hw1;

public class CustomerManager extends PersonalManager{
	
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger)
	{
		this.logger = logger;
	}
	
	
	//37
	public void list()
	{
		System.out.println("M��teri listelendi..");
	}

	public void add()
	{
		System.out.println("M��teri eklendi..");
		this.logger.log("Log Mesaj�");
	}
	
	
	

}
