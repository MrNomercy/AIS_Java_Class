package week8;

import java.util.Scanner;

public class exception_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while (true) {
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter first number:");
			int a = reader.nextInt();
			System.out.println("Enter second number:");
			int b = reader.nextInt();
			try {
				System.out.println("Result is:" + a / b);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("oop something went wrong.");
				e.printStackTrace();
			} 
		}
		
		

	}

}
