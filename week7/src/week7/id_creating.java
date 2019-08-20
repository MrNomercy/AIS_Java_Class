package week7;

import java.util.Random;
import java.util.UUID;

public class id_creating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UUID abc = Createid();
		System.out.println(abc);
		
		Random rand = new Random();
		int n = rand.nextInt(9999);
		System.out.println(n);

	}
	
	public static UUID Createid() 
	{
		UUID uuid = UUID.randomUUID();
		return uuid;
	}

}
