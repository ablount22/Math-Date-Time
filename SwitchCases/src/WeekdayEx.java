/* Author: Ashanti Blount
 * Date: 03/21/2022
 * Description: Writing the day of the week based on a given value
 * 
 */
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class WeekdayEx {
	
	public static void main(String[] args) {
		//Declaring the day of the week I want to know about
		LocalDate localDate = LocalDate.of(2003, Month.JANUARY, 23);
		//Setting the day as a variable
		DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
		//Printing out the weekday name of the day I wanted
		System.out.println("Day of the Week on " + "January 23rd 2003 - " + dayOfWeek.name());
		//Declaring the number of the day as an int
		int val = dayOfWeek.getValue();
		//Printing out the weekday name and what number day it is
		System.out.println("Int Value of " + dayOfWeek.name() + "-" + val);
		
		
		
		
	}

}
