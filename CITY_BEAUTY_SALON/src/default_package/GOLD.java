package default_package;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GOLD extends MEMBER //inheritance
{
	String [][] servicelist = {{"Haircuts","15"},{"shampoo S","10"},{"manicures","12"},{"pedicure","15"},{"body waxing","22"},{"massage","16"},{"shampoo P","9"},{"hair color","10"},{"skin care","30"},{"nail polish","8"}};
	
	//method related to enter product and service
	public void mygold() 
	{
		Scanner reader = new Scanner(System.in);
		ArrayList prolist = new ArrayList();
		ArrayList prilist = new ArrayList();
		char myoption = 'y';
		while (myoption != 'n') 
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter a number for service or product below:");
			int myproduct = scan.nextInt();
			//
			switch(myproduct) 
			{
			case 0:
				String product = servicelist[0][0];
				int price = Integer.parseInt(servicelist[0][1]);
				prolist.add(product);
				prilist.add(price);
				System.out.println(product+"  \t$"+price+" added.");
				break;
			case 1:
				String product1 = servicelist[1][0];
				int price1 = Integer.parseInt(servicelist[1][1]);
				prolist.add(product1);
				prilist.add(price1);
				System.out.println(product1+"  \t$"+price1+" added.");
				break;
			case 2:
				String product2 = servicelist[2][0];
				int price2 = Integer.parseInt(servicelist[2][1]);
				prolist.add(product2);
				prilist.add(price2);
				System.out.println(product2+"  \t$"+price2+" added.");
				break;
			case 3:
				String product3 = servicelist[3][0];
				int price3 = Integer.parseInt(servicelist[3][1]);
				prolist.add(product3);
				prilist.add(price3);
				System.out.println(product3+"  \t$"+price3+" added.");
				break;
			case 4:
				String product4 = servicelist[4][0];
				int price4 = Integer.parseInt(servicelist[4][1]);
				prolist.add(product4);
				prilist.add(price4);
				System.out.println(product4+"  \t$"+price4+" added.");
				break;
			case 5:
				String product5 = servicelist[5][0];
				int price5 = Integer.parseInt(servicelist[5][1]);
				prolist.add(product5);
				prilist.add(price5);
				System.out.println(product5+"  \t$"+price5+" added.");
				break;
			case 6:
				String product6 = servicelist[6][0];
				int price6 = Integer.parseInt(servicelist[6][1]);
				prolist.add(product6);
				prilist.add(price6);
				System.out.println(product6+"  \t$"+price6+" added.");
				break;
			case 7:
				String product7 = servicelist[7][0];
				int price7 = Integer.parseInt(servicelist[7][1]);
				prolist.add(product7);
				prilist.add(price7);
				System.out.println(product7+"  \t$"+price7+" added.");
				break;
			case 8:
				String product8 = servicelist[8][0];
				int price8 = Integer.parseInt(servicelist[8][1]);
				prolist.add(product8);
				prilist.add(price8);
				System.out.println(product8+"  \t$"+price8+" added.");
				break;
			case 9:
				String product9 = servicelist[9][0];
				int price9 = Integer.parseInt(servicelist[9][1]);
				prolist.add(product9);
				prilist.add(price9);
				System.out.println(product9+"  \t$"+price9+" added.");
				break;
			case 10:
				PRODUCT mypro = new PRODUCT();
				mypro.printmylist();
				break;
			default:
				System.out.println("Invalid Input.");
			}
			//
			System.out.println("Add more item? 'y or n'");
			myoption = reader.next().charAt(0);
		}
		Random myrandom = new Random();
		int customer_count = myrandom.nextInt(99);
		MEMBER mymem = new MEMBER();
		String member = "Gold";
		mymem.displayreceipt(prolist,prilist,customer_count,15,member);
		mymem.printreceipt(prolist, prilist,customer_count,15,member);
		//end of while loop
		
		
	}
	

}
