package default_package;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TEST {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		//printmylist();
		
		char option = 'y'; 
		while(option != 'n') 
		{
			try {
				System.out.println("========Welcome to City Beauty Salon========\n");
				Scanner testreader = new Scanner(System.in);
				System.out.println("please choose your membership status:");
				System.out.println("1 for premium membership");
				System.out.println("2 for gold membership");
				System.out.println("3 for silver membership");
				System.out.println("4 for non-membership");
				System.out.println("5 for add new customer");
				System.out.println("6 for display all Service");
				System.out.println("7 for display all Product");
				int membership = testreader.nextInt();
				switch (membership) {
				case 1:
					//premium membership
					PRODUCT mypro = new PRODUCT();
					mypro.printmylist();
					PREMIUM Pre = new PREMIUM();
					Pre.mypremium();
					break;
				case 2:
					//gold membership
					PRODUCT mypro2 = new PRODUCT();
					mypro2.printmylist();
					GOLD gold = new GOLD();
					gold.mygold();
					break;
				case 3:
					//silver membership
					PRODUCT mypro3 = new PRODUCT();
					mypro3.printmylist();
					SILVER silver = new SILVER();
					silver.mysilver();
					break;
				case 4:
					//non membership
					PRODUCT mypro4 = new PRODUCT();
					mypro4.printmylist();
					MEMBER mymember = new MEMBER();
					mymember.mynomem();
					break;
				case 5:
					//do something
					CUSTOMER.add_customer();
					break;
				case 6:
					SERVICE myservice = new SERVICE();
					myservice.printmyservice();
					break;
				case 7:
					PRODUCT myproduct = new PRODUCT();
					myproduct.printmyproduct();
					break;
				default:
					System.out.println("invalid input");
					break;
				}
				System.out.println("continue? 'y or n'");
				option = scan.next().charAt(0);
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("Sorry, The input do not match data type");
			} catch (Exception e1) {
				System.out.println("Sorry, Something went wrong");
			}
		}

	}
	//
}
