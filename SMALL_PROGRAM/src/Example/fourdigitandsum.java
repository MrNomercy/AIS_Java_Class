package Example;

import java.util.Scanner;

public class fourdigitandsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("please enter a 4 digit number: ");
		String mynum = reader.next();
		reader.close();
		char d1 = mynum.charAt(0);
		int n1 = Character.getNumericValue(d1);
		char d2 = mynum.charAt(1);
		int n2 = Character.getNumericValue(d2);
		char d3 = mynum.charAt(2);
		int n3 = Character.getNumericValue(d3);
		char d4 = mynum.charAt(3);
		int n4 = Character.getNumericValue(d4);
		int result = n1+n2+n3+n4;
		System.out.println("The sum of 4 digit number is: "+result);

	}

}
