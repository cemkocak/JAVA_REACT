package lesson3_hw2;

public class InstructorManager extends UserManager{
	
	public void add(Instructor instructor)
	{
		System.out.println("E�itmen eklendi.");
	}
	
	public void remove(Instructor instructor)
	{
		System.out.println("E�itmen silindi.");
	}
	
	public void update(Instructor instructor)
	{
		System.out.println("E�itmen g�ncellendi.");
	}

}
