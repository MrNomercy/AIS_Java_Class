package week4;

import java.util.Random;
import java.util.Scanner;

public class MathGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("_____Math Game_____");
		Scanner reader = new Scanner(System.in);
		System.out.println("please enter \na for addition, \ns for subtraction, \nm for multiplication, \nd for division: ");
		String option = reader.next();
		
		int correct = 0;
		int incorrect = 0;
		int total = 5;
		int mytry = 0;
		switch (option) 
		{
		case "a":
		case "A":
			int a = 1;
			while (a<=5) 
			{
				Random rand = new Random();
				int R1 = rand.nextInt(50);
				R1+=1;
				int R2 = rand.nextInt(50);
				R2+=1;
				
				System.out.println("Q"+a);
				System.out.println(R1+" + "+R2+" = ");
				int answer = reader.nextInt();
				if (answer==(R1+R2)) 
				{
					correct+=1;
					System.out.println("correct");
				}
				else 
				{
					mytry+=1;
					int t1 = 3;
					while(t1>=2) 
					{
					System.out.println("Try Again.");
					System.out.println("Q"+a);
					System.out.println(R1+" + "+R2+" = ");
					int tryagain = reader.nextInt();
					if (tryagain==(R1+R2))
					{
						System.out.println("correct");
						correct+=1;
						break;
					}
					else 
					{
						mytry+=1;
					}
					t1--;
					}
				}
				a++;
			}
			break;
		case "s":
		case "S":
			int b = 1;
			while (b<=5) 
			{
				Random rand = new Random();
				int R1 = rand.nextInt(50);
				R1+=1;
				int R2 = rand.nextInt(50);
				R2+=1;
				
				System.out.println("Q"+b);
				System.out.println(R1+" - "+R2+" = ");
				int answer = reader.nextInt();
				if (answer==(R1-R2)) 
				{
					correct+=1;
					System.out.println("correct");
				}
				else 
				{
					mytry+=1;
					int t1 = 3;
					while(t1>=2) 
					{
					System.out.println("Try Again.");
					System.out.println("Q"+b);
					System.out.println(R1+" - "+R2+" = ");
					int tryagain = reader.nextInt();
					if (tryagain==(R1-R2))
					{
						System.out.println("correct");
						correct+=1;
						break;
					}
					else 
					{
						mytry+=1;
					}
					t1--;
					}
				}
				b++;
			}
			break;
		case "m":
		case "M":
			int c = 1;
			while (c<=5) 
			{
				Random rand = new Random();
				int R1 = rand.nextInt(50);
				R1+=1;
				int R2 = rand.nextInt(50);
				R2+=1;
				
				System.out.println("Q"+c);
				System.out.println(R1+" * "+R2+" = ");
				int answer = reader.nextInt();
				if (answer==(R1*R2)) 
				{
					correct+=1;
					System.out.println("correct");
				}
				else 
				{
					mytry+=1;
					int t1 = 3;
					while(t1>=2) 
					{
					System.out.println("Try Again.");
					System.out.println("Q"+c);
					System.out.println(R1+" * "+R2+" = ");
					int tryagain = reader.nextInt();
					if (tryagain==(R1*R2))
					{
						System.out.println("correct");
						correct+=1;
						break;
					}
					else 
					{
						mytry+=1;
					}
					t1--;
					}
				}
				c++;
			}
			break;
		case "d":
		case "D":
			int d = 1;
			while (d<=5) 
			{
				Random rand = new Random();
				int R1 = rand.nextInt(50);
				R1+=1;
				int R2 = rand.nextInt(50);
				R2+=1;
				
				System.out.println("Q"+d);
				System.out.println(R1+" / "+R2+" = ");
				int answer = reader.nextInt();
				if (answer==(R1/R2)) 
				{
					correct+=1;
					System.out.println("correct");
				}
				else 
				{
					mytry+=1;
					int t1 = 3;
					while(t1>=2) 
					{
					System.out.println("Try Again.");
					System.out.println("Q"+d);
					System.out.println(R1+" / "+R2+" = ");
					int tryagain = reader.nextInt();
					if (tryagain==(R1/R2))
					{
						System.out.println("correct");
						correct+=1;
						break;
					}
					else 
					{
						mytry+=1;
					}
					t1--;
					}
				}
				d++;
			}
			break;
		default:
			System.out.println("invalid input.");
			
		}
		incorrect = mytry/3;
		System.out.println("result:");
		System.out.println("Total Game: "+total);
		System.out.println("Correct: "+correct);
		System.out.println("Incorrect: "+incorrect);
		System.out.println("Attempt: "+mytry);
		System.out.println("Thank you for playing!");
		reader.close();

	}

}
