import java.util.Scanner;

public class Undergraduatestudent extends Patron {
	Scanner undergrade=new Scanner(System.in);
	public void addUndergraduatestudent()
	{
		System.out.println("Enter Name");
		this.setName(undergrade.next());
		System.out.println("Enter Address");
		this.setAddress(undergrade.next());
	}

}
