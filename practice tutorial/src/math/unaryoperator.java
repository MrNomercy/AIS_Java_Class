package math;

public class unaryoperator {

	public static void main(String[] args) {
		
		int i;
		i = 10;
		//i++; 
		/*
		 * System.out.println(i); i--; System.out.println(i);
		 */
		
		int a;
		//a = ++i;
		//a = i++ first assign the i to a then increase i value;
		//a = ++i first increase the value of i and then assign to a;
		//System.out.println(a);
		a = --i;
		System.out.println(a);
		System.out.println(i);
		a = i++;
		System.out.println(a);
		System.out.println(i);

	}

}
