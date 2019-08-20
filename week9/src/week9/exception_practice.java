package week9;

import java.util.Scanner;

public class exception_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while (true) {
			try {
				Scanner reader = new Scanner(System.in);
				System.out.print("Please enter a number: ");
				int num1 = reader.nextInt();
				System.out.print("Please enter a number: ");
				int num2 = reader.nextInt();
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			} 
			catch (Exception e) {
				System.out.println("OOP, number please not String");
			} 
			
			
		}

	}

}
