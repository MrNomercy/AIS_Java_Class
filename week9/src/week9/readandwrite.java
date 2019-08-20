package week9;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class readandwrite {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char myoption = 'y';
		while(myoption != 'n') 
		{
			try {
				
				System.out.println("Enter 1 for write the text\nEnter 2 for read the text\nEnter 3 for clear the text.");
				int option = scan.nextInt();
				switch(option) 
				{
				case 1:
					FileWriter myFW = new FileWriter("myfile.txt",true);
					BufferedWriter FW = new BufferedWriter(myFW);
					Scanner myscan = new Scanner(System.in);
					System.out.println("plese enter your text:");
					String userinput = myscan.nextLine();
					FW.write("\n");
					FW.write(userinput);
					FW.close();
					break;
				case 2:
					FileReader FR = new FileReader("myfile.txt");
					int i ;
					while((i=FR.read()) != -1) 
					{
						System.out.print((char)i);
					}
					System.out.print("\n");
					break;
				case 3:
					FileWriter myrest = new FileWriter("myfile.txt");
					break;
				default:
					System.out.println("Invalid input.");
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Invalid input");
			} catch (InputMismatchException ex) {
				System.out.println("please enter number not string.");
			}
			
			System.out.println("Continue? y or n");
			myoption = scan.next().charAt(0);
		}
		
		
		
		

	}
	
	
}
