package math;

import java.util.Scanner;

public class funny {

	public static void main(String[] args) {
		
		int d = 21;
		String e = "43";
		System.out.println(e+String.valueOf(d));
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = userInput.next();
		System.out.print("Hello "+ name);
		userInput.close();
		
	}

}
