package lesson3_hw2;

public class StudentManager extends UserManager{
	
	public void add(Student student)
	{
		System.out.println("��renci eklendi.");
	}
	
	public void remove(Student student)
	{
		System.out.println("��renci silindi.");
	}
	
	public void update(Student student)
	{
		System.out.println("��renci g�ncellendi.");
	}

}
