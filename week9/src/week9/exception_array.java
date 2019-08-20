package week9;

import java.util.ArrayList;
import java.util.Scanner;

public class exception_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList fruit = new ArrayList();
		Scanner reader = new Scanner(System.in);
		
		while (true) {
			System.out.println("Please choose an option:");
			System.out.println("1 for add item.");
			System.out.println("2 for remove item.");
			System.out.println("3 for find item.");
			System.out.println("4 for display the list");
			int option = reader.nextInt();
			switch (option) {
			case 1:
				System.out.println("enter 'exit' to stop adding");
				String exit = " ";
				while(exit != "exit") 
				{
					System.out.println("Please enter an item: ");
					String myitem = reader.nextLine();
					exit = myitem;
					fruit.add(myitem);
				}
				System.out.println(fruit);
				break;
			case 2:
				System.out.println("enter 'exit' to stop removing");
				
				
				break;
			
			default:
				System.out.println("Invalid input.");
			

			}
		}

	}

}
