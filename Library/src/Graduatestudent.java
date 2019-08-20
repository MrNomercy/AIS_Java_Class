import java.util.Scanner;

public class Graduatestudent extends Patron {
	Scanner graduatestudent= new Scanner(System.in);
	public void addGraduatestudent() 
	{
		System.out.println("Enter Name");
		this.setName(graduatestudent.next());
		System.out.println("Enter Address");
		this.setAddress(graduatestudent.next());
	}
	}

