package week7;

import java.util.Scanner;

public class Prac_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.print("please end a number: ");
		int n = reader.nextInt();
		
		String mybox = SquareBoard(n);
		System.out.print(mybox);

	}
	
	public static String SquareBoard(int n) 
	{
		String Square = "";
		for (int i=0;i<n;i++) 
		{
			for (int j=0;j<n;j++) 
			{
				Square = Square + "# ";
			}
			Square = Square +"\n";
		}
		return Square;
	}

}
