package utilclass;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {
	
	
	/**
	 String displayCalendar(int month, int year){}
int getLastDayOfMonth(int month, int year){} 
String toString(int month, int day, int year, String delimiter){} //prints the date as mm/dd/yyyy
bool isLeapYear(int year){}
	 */
	
	
	public static String displayCalendar(int month, int year) {
		
		
		
	 	returncd..
		
	}
	
	public static int getLastDayofMonth(int month, int year) {
		
	}
	
	public static String toString(int month, int day, int year, String delimiter) {
		
	}
	
	public boolean isLeapYear(int year){
		
		//returns t/f if the year is a leap year
		// leap years are all years divisible by 4 but not 100
		// years that are divisible by 400 are leap years, too
		// is it divisible by 4?
		// Note that the year is not passed as an argument. It could be but 
		// I choose to use the class level private variable for my method.
		boolean bLeapYear = false;
		bLeapYear = (year % 4 == 0);
		// is it divisible by 4 and not 100
		bLeapYear = bLeapYear && (year % 100 != 0);
		// is it divisible by 4 and not 100 unless it's divisible by 400
		bLeapYear = bLeapYear || (year % 400 == 0);
		return bLeapYear;
	}
	
}
	
/**
 private static int calculateMyAge(int year, int month, int day) {
 
       Calendar birthCal = new GregorianCalendar(year, month, day);
 
       Calendar nowCal = new GregorianCalendar();
 
       int age = nowCal.get(Calendar.YEAR) - birthCal.get(Calendar.YEAR);
 
       boolean isMonthGreater = birthCal.get(Calendar.MONTH) >= nowCal
                     .get(Calendar.MONTH);
 
       boolean isMonthSameButDayGreater = birthCal.get(Calendar.MONTH) == nowCal
                     .get(Calendar.MONTH)
                     && birthCal.get(Calendar.DAY_OF_MONTH) > nowCal
                     .get(Calendar.DAY_OF_MONTH);
 
       if (isMonthGreater || isMonthSameButDayGreater) {
              age=age-1;
       }
              return age;
       }
 
 */
	
	
	
	
	
	
	
	
	
	

