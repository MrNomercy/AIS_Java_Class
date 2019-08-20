package mygradingsystem;

import java.util.Scanner;

public class gradingSystem {

	public static void main(String[] args) {
		// grading system
		// assignment 1 = 30% visual_score = 200 mark
		// mid-term = 30% visual_score = 100 mark
		// final = 40% visual_score = 200 mark
		//System.out.println("Please enter your assignment, mid-term and final to calculate the final grade.");
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter your assignment I score(Max=200): ");
		float v_assignment = reader.nextFloat();
		System.out.println("Please enter your mid-term score(Max=100): ");
		float v_midterm = reader.nextFloat();
		System.out.println("Please enter your assignment II score(Max=200): ");
		float v_final = reader.nextFloat();
		reader.close();
		
		float a_assignment, a_midterm, a_final;
		
		v_assignment = v_assignment/2;
		a_assignment = v_assignment*30/100;
		
		v_midterm = v_midterm/1;
		a_midterm = v_midterm*30/100;
		
		v_final = v_final/2;
		a_final = v_final*40/100;
		
		float total_score;
		total_score = a_assignment + a_midterm + a_final;
		String result;
		
		if (total_score >= 80) 
		{
			result = "A";
		}
		else if (total_score >= 70)
		{
			result = "B";
		}
		else if (total_score >= 60) 
		{
			result = "C";
		}
		else if (total_score >= 50) 
		{
			result = "D";
		}
		else 
		{
			result = "F";
		}
		
		System.out.println("\nYour total score is: "+total_score+"%");
		System.out.println("Your final grade is: "+result);
		
	}

}
