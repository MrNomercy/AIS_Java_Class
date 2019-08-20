package week7;

import java.util.Scanner;

public class Prac_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.print("Please enter your mark: ");
		int mark = reader.nextInt();
		
		String result = CheckPassFail(mark);
		System.out.println(result);
	}
	
	public static String CheckPassFail(int marks) 
	{
		String myresult = "";
		if(marks>=50) 
		{
			String result = "Pass\nDone";
			myresult = result;
		}
		else if(marks<50) 
		{
			String result = "Fail\nDone";
			myresult = result;
			
		}
		return myresult;
		
	}

}
