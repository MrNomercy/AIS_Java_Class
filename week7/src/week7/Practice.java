package week7;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Practice {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Date dateOfBorrow = new Date();
		System.out.println("Borrow Date:\t"+dateOfBorrow);
		int noOfDays = 14; //i.e two weeks
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateOfBorrow);            
		calendar.add(Calendar.DAY_OF_YEAR, noOfDays);
		Date dateReturn = calendar.getTime();
		System.out.println("Return Date:\t"+dateReturn);
		
		//
		LocalDate today = LocalDate.now();
        System.out.println("Current date:\t" + today);

        //add 2 week to the current date
        LocalDate next2Week = today.plus(2, ChronoUnit.WEEKS);
        System.out.println("Next week:\t" + next2Week);
		
	}

}
