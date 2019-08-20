package math;

import java.util.Scanner;

public class checking_grade {

	public static void main(String[] args) {
		
		//int C1,C2,C3,Av;
		//C1 = 50; C2 = 80; C3 = 90;
		
		System.out.print("Please enter your course result below.\n");
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter the course 1 score: ");
		int C1 = userInput.nextInt();
		System.out.print("Please enter the course 2 score: ");
		int C2 = userInput.nextInt();
		System.out.print("Please enter the course 3 score: ");
		int C3 = userInput.nextInt();
		userInput.close();

		int Av;
		Av = (C1 + C2 + C3) / 3;
		String result;
		
		if (Av >= 80) 
		{
			result = "A";
		}
		else if (Av >= 60) 
		{
			result = "B";
		}
		else if (Av >= 50)
		{
			result = "C";
		}
		else
		{
			result = "F";
		}
		
		System.out.println("your grade is "+result);
	
		

	}

}
