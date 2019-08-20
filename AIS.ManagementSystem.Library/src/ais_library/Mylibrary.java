package ais_library;

import java.util.Scanner;

public class Mylibrary {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		do
		{
			System.out.println("___AIS Library Management System___");
			Scanner reader = new Scanner(System.in);
			System.out.println("Please enter\nI for add new item\nU for add new user ");
			String option = reader.next();
			//Switch case for I, U, or E.
			switch (option) 
			{
			case "I":
			case "i":
				while (option!="e") 
				{
					//do something
					System.out.println("Please enter\nB for add new book\nV for add new video\nD for add new DVD\nE for exit.");
					String item_option = reader.next();
					//item switch case
					switch (item_option) 
					{
					case "B":
					case "b":
						//do 
					case "V":
					case "v":
						//do
					case "D":
					case "d":
						//do
					default:
						System.out.println("Invalid Input, Please enter again.");
					}
				}//while loop of i
				
				//end of case i
			case "U":
			case "u":
				//do something
			case "E":
			case "e":
				break;
			default:
				System.out.println("Invalid Input, please enter again.");
			
			break;
			
			}//end of switch case for I, U, or E.
		}while(true);//end of while loop level 1.

	}

}
