package week7;

public class Prac_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SumAndAverage());

	}
	
	public static String SumAndAverage() 
	{
		float sum =0;
		for(int i=1;i<101;i++) 
		{
			sum+=i;
		}
		float ave = sum/100;
		String result = "The sum is "+sum+"\nThe average is "+ave;
		return (result);
	}

}
