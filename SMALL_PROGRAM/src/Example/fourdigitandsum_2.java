package Example;

import java.util.Scanner;

public class fourdigitandsum_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("please enter a 4 digit number: ");
		int mynum = reader.nextInt();
		reader.close();
		int num1 = mynum/1000%10;
		//System.out.println(num1);
		int num2 = (mynum - num1*1000)/100%10;
		//System.out.println(num2);
		int num3 = (mynum - num1*1000 - num2*100)/10%10;
		//System.out.println(num3);
		int num4 = (mynum - num1*1000 - num2*100 - num3*10)/1%10;
		//System.out.println(num4);
		int sum = num1+num2+num3+num4;
		System.out.println("The sum of 4 digits number is: "+sum);
		
	}

}
