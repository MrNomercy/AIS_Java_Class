package week7;

import java.util.Scanner;

public class Prac_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.print("please enter a number: ");
		int number = reader.nextInt();
		
		String result = CheckOddEven(number);
		System.out.println(result);
		
		

	}
	
	public static String CheckOddEven(int number) 
	{
		String result = "";
		if(number%2==0) 
		{
			result += "Even Number\nBYE";
			
		}
		else if(number%2!=0) 
		{
			result += "Odd Number\nBYE";
		
		}
		return result;
	}

}
