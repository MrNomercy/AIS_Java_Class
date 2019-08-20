package week4;

import java.util.Scanner;

public class SwitchCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("please enter \na for addition, \ns for subtraction, \nm for multiplication, \nd for division: ");
		String option = reader.next();
		
		System.out.println("please enter first number: ");
		int n1 = reader.nextInt();
		
		System.out.println("please enter second number: ");
		int n2 = reader.nextInt();
		
		reader.close();
		
		switchcalfun myfunc = new switchcalfun();
		
		switch (option) 
		{
		case "a":
		case "A":
			int plus_result = myfunc.addition(n1, n2);
			System.out.println(n1+" + "+n2+" = "+plus_result);
			break;
		case "s":
		case "S":
			int minus_result = myfunc.subtraction(n1, n2);
			System.out.println(n1+" - "+n2+" = "+minus_result);
			break;
		case "m":
		case "M":
			int time_result = myfunc.multiplication(n1, n2);
			System.out.println(n1+" * "+n2+" = "+time_result);
			break;
		case "d":
		case "D":
			int divide_result = myfunc.division(n1, n2);
			System.out.println(n1+" / "+n2+" = "+divide_result);
			break;
		default:
			System.out.println("Error, Invalid input.");
		}
		

	}

}
