/*Author: Ashanti Blount
 * Date: 03/21/2022
 * Description: Writing today's date, yesterday's date, and tomorrow's date
 * 
 */
import java.time.LocalDate;

public class DateandTime {
	
	public static void main(String[] args) {
		//Declaring today's date as a variable
		LocalDate date = LocalDate.now();
		//Declaring yesterday's date as a variable
		LocalDate yesterday = date.minusDays(1);
		//Declaring tomorrow's date as a variable
		LocalDate tomorrow = yesterday.plusDays(2);
		
		//Printing out the dates
		System.out.println("Today's date: " + date);
		System.out.println("Yesterday's date: " + yesterday);
		System.out.println("Tomorrow's date: " + tomorrow);
		
		
		
		
	}

}