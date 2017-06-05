package utilclass;

import java.text.NumberFormat;
import java.util.Random;

public class Number {
	
	public static String FormatPercentage(double majority) {
		NumberFormat percent = NumberFormat.getPercentInstance();
		String majorityString = percent.format(majority);
		return majorityString;
	}
	
	public static String FormatCurrency(double price) {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String priceString = currency.format(price);
		return priceString;
	}
	
	public static String FormatDecimal(double miles) {
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(2);
		String mileString = number.format(miles);
		return mileString;
	}
	
	/**return a random number between two values, A and B (inclusive)
	see the previous assignment on Random numbers*/
	public static String FormatRandom(double ranone, double rantwo) {
		Random r = new Random();
		NumberFormat randomnum = NumberFormat.getNumberInstance();
		String randomnumString = randomnum.format(Math.random(ran)	
		return randomString;
	
		
	}
	
	
		
	public static String FormatMax(double numone, double numtwo) {
		NumberFormat maxval = NumberFormat.getCurrencyInstance();
		String maxvalString = maxval.format(Math.max(numone, numtwo));
		return maxvalString;
	}
	
	public static String FormatMin(double numthree, double numfour) {
		NumberFormat minval = NumberFormat.getCurrencyInstance();
		String minvalString = minval.format(Math.min(numthree, numfour));
		return minvalString;
	}
			
/**public static String FormatRandom(double x, double y) {
		
		NumberRandom guess = NumberFormat.);
		number.setMaximumFractionDigits(2);
		String mileString = number.format(miles);
		return (mileString);
		
		Random r = new Random();
		
		int secretNum = 1 + r.nextInt(1000) ;
		int numsAmt = 0; */
		
	}
		
		

}

