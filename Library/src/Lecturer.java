import java.util.Scanner;

public class Lecturer extends Patron {
	Scanner lecturer= new Scanner(System.in);
	public void addLecturer()
	{
		System.out.println("Enter Name");
		this.setName(lecturer.next());
		System.out.println("Enter Address");
		this.setAddress(lecturer.next());

	}
	
}
