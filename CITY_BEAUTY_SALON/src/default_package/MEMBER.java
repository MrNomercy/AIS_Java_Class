package default_package;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MEMBER 
{
	
	String [][] servicelist = {{"Haircuts","15"},{"shampoo S","10"},{"manicures","12"},{"pedicure","15"},{"body waxing","22"},{"massage","16"},{"shampoo P","9"},{"hair color","10"},{"skin care","30"},{"nail polish","8"}};
	
	//============= all function=====================
	
	// calculate subtotal function
	public static float mysubtotal(float subtotal,float discount) 
	{
		float sub_dis = subtotal-(subtotal*discount/100);
		return sub_dis;
	}
	
	// calculate tax function
	public static float mytax(float subtotal) 
	{
		float tax = subtotal*15/100;
		return tax;
	}
	
	// calculate total function
	public static float myfinalcost(float subtotal,float tax)
	{
		
		float totalcost = subtotal + tax;
		return totalcost;
	}
	
	// print the receipt on cli
	public void displayreceipt(ArrayList product,ArrayList price,int customer_count,int discount,String Membership) 
	{
		LocalDate Now = LocalDate.now();
		//Random myrandom = new Random();
		System.out.println("CITY Beauty Salon  "+Now+" Customer Count: "+customer_count);
		System.out.println("Membership: "+ Membership+"\n");
		int subtotal = 0;
		for(int i=0;i<product.size();i++) 
		{
			System.out.println(product.get(i)+"  \t"+"\t$"+price.get(i));
			int myprice = (int) price.get(i);
			subtotal += myprice;
		}
		float mysubtotal = mysubtotal(((float)subtotal),((float)discount));
		System.out.println("Subtotal:"+"\t"+"\t$"+mysubtotal);
		float mytax = mytax(mysubtotal);
		System.out.println("Tax:"+"  \t"+"\t$"+mytax);
		float myfinalcost = myfinalcost(mysubtotal,mytax);
		System.out.println("Total Cost:"+"\t$"+myfinalcost);
		
	}
	
	// generate the receipt in txt file
	public void printreceipt(ArrayList product,ArrayList price,int customer_count,int discount,String Membership) 
	{
		LocalDate Now = LocalDate.now();
		//Random myrandom = new Random();
		try {
			FileWriter myfile = new FileWriter("receipt.txt",true);
			BufferedWriter FW = new BufferedWriter(myfile);
			String line1 = ("CITY Beauty Salon  "+Now+" Customer Count: "+customer_count);
			FW.write(line1);
			FW.write("\r\n");
			String line2 = ("Membership: "+ Membership);
			FW.write(line2);
			FW.write("\r\n");
			FW.write("\r\n");
			int subtotal = 0;
			for(int i=0;i<product.size();i++) 
			{
				String line3 = (product.get(i)+"  \t"+"\t$"+price.get(i));
				FW.write(line3);
				FW.write("\r\n");
				int myprice = (int) price.get(i);
				subtotal += myprice;
			}
			float mysubtotal = mysubtotal(((float)subtotal),((float)discount));
			String line4 = ("Subtotal:"+"\t"+"\t$"+mysubtotal);
			FW.write(line4);
			FW.write("\r\n");
			float mytax = mytax(mysubtotal);
			String line5 = ("Tax:"+"  \t"+"\t$"+mytax);
			FW.write(line5);
			FW.write("\r\n");
			float myfinalcost = myfinalcost(mysubtotal,mytax);
			String line6 = ("Total Cost:"+"\t$"+myfinalcost);
			FW.write(line6);
			FW.write("\r\n");
			FW.write("\r\n");
			FW.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("cannot find the file.");
		}
		
		
	}
	
	//
	// method related to enter product and service
	public void mynomem() 
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
		String member = "No Membership";
		mymem.displayreceipt(prolist,prilist,customer_count,0,member);
		mymem.printreceipt(prolist, prilist,customer_count,0,member);
	
	}
	

}
