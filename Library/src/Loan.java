import java.util.Scanner;

public class Loan {
	String LoanTitle;
	String PatronName;
	String theloandate;
	String thereturndate;
	Scanner loan=new Scanner(System.in);
	public void addLoan()
	{
		System.out.println("Add Loan Title");
		LoanTitle=loan.nextLine();
		System.out.println("Add Patron Name");
		PatronName=loan.nextLine();
		System.out.println("Add The Loan Date");
		theloandate=loan.nextLine();
		System.out.println("Add The Return Date");
		thereturndate=loan.nextLine();
	}
	
	

}
