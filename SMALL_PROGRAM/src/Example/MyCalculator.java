package Example;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator_function func = new MyCalculator_function();
		
		int plus = func.addition(5, 8);
		System.out.println(plus);
		
		int minus = func.subtraction(9, 4);
		System.out.println(minus);
		
		int time = func.multiplication(9, 2);
		System.out.println(time);
		
		int divide = func.division(90, 10);
		System.out.println(divide);
		
	}

}
