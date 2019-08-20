package default_package;

public class SERVICE {
String [][] servicelist = {{"Haircuts","15"},{"shampoo S","10"},{"manicures","12"},{"pedicure","15"},{"body waxing","22"},{"massage","16"},{"shampoo P","9"},{"hair color","10"},{"skin care","30"},{"nail polish","8"}};
	
	//print the product & service list function
	public static void printmylist()
	{
		String [][] servicelist = {{"Haircuts","15"},{"shampoo S","10"},{"manicures","12"},{"pedicure","15"},{"body waxing","22"},{"massage","16"},{"shampoo P","9"},{"hair color","10"},{"skin care","30"},{"nail polish","8"}};
		System.out.println("===============================");
		System.out.println("Services & Products");
		for(int i =0;i<servicelist.length;i++) 
		{
			System.out.println(i+" "+servicelist[i][0]+"  \t$"+servicelist[i][1]);
		}
		System.out.println("10 print the menu again.");
		System.out.println("===============================");
	}
	
	public void printmyservice() 
	{
		String [][] servicelist = {{"Haircuts","15"},{"shampoo S","10"},{"manicures","12"},{"pedicure","15"},{"body waxing","22"},{"massage","16"}};
		System.out.println("Service list");
		for(int i =0;i<servicelist.length;i++) 
		{
			System.out.println(" "+servicelist[i][0]+"  \t$"+servicelist[i][1]);
		}
		
	}

}
