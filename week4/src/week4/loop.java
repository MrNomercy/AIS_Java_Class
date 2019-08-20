package week4;

public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while loop
		int x = 1;
		while (x<=10) 
		{
			System.out.println(x);
			x++;
		}
		
		// for loop
		for (int a=1; a<=20 ;a++) 
		{
			System.out.println(a);
		}
		
		// do while loop
		int b = 5;
		do 
		{
			System.out.println(b);
			b++;
		}while(b<50);
		
		// for each loop
		String[] animal = {"chicken","pig","duck","cow","sheep","goat"};
		for (int i = 0; i < animal.length;i++) 
		{
			System.out.println("I like "+animal[i]);
		}
		
		// different syntax
		String[] fishes = new String[] {"tuna","salmon","gold fish","whale"};
		for (String fish : fishes) 
		{
			System.out.println("I don't like "+fish);
		}

	}

}
