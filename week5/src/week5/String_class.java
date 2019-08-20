package week5;

import java.util.Scanner;
import java.lang.String;

public class String_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.print("Please enter your full name: ");
		String full_name = reader.nextLine();
		//String[] name = full_name.split("\\s+");
		//System.out.println(name[0]);
		//System.out.println("Welcome Mr."+name[1]);
		int mylength = full_name.length();
		char[] fullname = full_name.toCharArray();
		
		for (int i=0; i<mylength;i++) {
			if (Character.isWhitespace(fullname[i])) 
			{
				int pos = i;
				String last_name = full_name.substring(pos);
				String CL = last_name.substring(0,2).toUpperCase();
				String LN = CL + last_name.substring(2);
				System.out.println("Hello Mr."+LN);
				break;
			}
		}
		
		

	}

}
