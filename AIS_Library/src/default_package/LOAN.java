package default_package;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LOAN {
	
	Scanner loanreader = new Scanner(System.in);
	ArrayList loans = new ArrayList();
	Random rand = new Random();
	int loanid;
	String loantitle;
	String Patronname;
	//LocalDate loandate = LocalDate.now();
	//LocalDate returndate = loandate.plus(2,ChronoUnit.WEEKS);
	
	public void add_new_loan() 
	{
		this.loanid = rand.nextInt(999999);
		System.out.println("Please enter the loan title");
		this.loantitle = loanreader.nextLine();
		System.out.println("Please enter the patron name");
		this.Patronname = loanreader.nextLine();
		LocalDate loandate = LocalDate.now();
		LocalDate returndate = loandate.plus(2,ChronoUnit.WEEKS);
		//array
		loans.add(loanid);
		loans.add(loantitle);
		loans.add(Patronname);
		loans.add(loandate);
		loans.add(returndate);
		System.out.println("---Loan successfully---");
	}

}
