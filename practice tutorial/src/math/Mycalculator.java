package math;

public class Mycalculator {

	// method overloading
	public int add(int a, int b){
		
		return (a + b);
	}
	
	public int add(int a, int b, int c) {
		
		return (a + b + c);	
	}
	
	public double add(double a, double b, double c) {
		
		return (a + b + c);	
	}
	
	public double add(double a, double b) {
		
		return (a + b);	
	}
	
	public int remove(int a, int b){
		
		return (a - b);
	}
	
	public int remove(int a, int b, int c){
		
		return (a - b - c);
	}
	
	public double time(double a, double b, double c) {
		return (a * b * c);
	}
	
	public double divide(double a,double b) {
		return (a / b);
	}
	
	public int cube(int a) {
		
		return (a*a*a);
	}
	
	

}
