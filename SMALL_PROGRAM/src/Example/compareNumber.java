package Example;

import java.util.Scanner;

public class compareNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter 3 value to compare.\n");
		
		Scanner reader = new Scanner(System.in);
		System.out.println("please enter the first value: ");
		float v1 = reader.nextFloat();
		System.out.println("please enter the second value: ");
		float v2 = reader.nextFloat();
		System.out.println("please enter the third value: ");
		float v3 = reader.nextFloat();
		reader.close();
		
		if (v1 > v2 && v1 > v3) 
		{
			System.out.println(v1+" is the biggest number.");
		}
		else if (v2 > v3 && v2 > v1) 
		{
			System.out.println(v2+" is the biggest number.");
		}
		else if (v3 > v1 && v3 > v2) 
		{
			System.out.println(v3+" is the biggest number.");
		}
		else if (v1 == v2 && v1>v3 && v2>v3) 
		{
			System.out.println("The first and second value are the same "+v3+" is the smallest value.");
		}
		else if (v2 == v3 && v2>v1 && v3>v1) 
		{
			System.out.println("The second and third value are the same "+v1+" is the smallest value.");
		}
		else if (v1 == v3 && v1>v2 && v3>v2) 
		{
			System.out.println("The first and third value are the same "+v2+" is the smallest value.");
		}
		else if (v1 == v2 && v2 == v3) 
		{
			System.out.println("All the value are the same.");
		}
		else 
		{
			System.out.println("Invalid value.");
		}

	}

}
