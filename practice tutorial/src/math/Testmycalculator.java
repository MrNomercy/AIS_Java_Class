package math;

public class Testmycalculator {

	public static void main(String[] args) {
		
		Mycalculator obj = new Mycalculator();
		System.out.println(obj.add(2,3));
		System.out.println(obj.add(5,7,8));
		System.out.println(obj.remove(5,7));
		System.out.println(obj.time(5,5,5));
		System.out.println(obj.divide(125,5));
		System.out.println(obj.cube(7));
		
		
		/*int d = 32;
		String e = "21";
		System.out.println(e+String.valueOf(d));*/
		int mynum = 9;
		Exe mymethod = new Exe();
		int result = mymethod.square(mynum);
		System.out.println(result);
	}

}
