package utilclass;

import java.text.NumberFormat;
import java.util.Random;


public class Number {
	
	public static String FormatPercentage(double majority) {
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMaximumFractionDigits(2);
		String majorityString = percent.format(majority);
		return majorityString;
	}
	
	public static String[] FormatPercentage(double majority, double twodec) {
	    String[] percentArray = new String[2];
		NumberFormat percent = NumberFormat.getPercentInstance();
		percentArray[0] = percent.format(majority);
		NumberFormat percentTwo = NumberFormat.getPercentInstance();
		percentArray[1] = percentTwo.format(twodec);
	    return percentArray; 
	}	    
		
	public static String FormatCurrency(double price) {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		currency.setMaximumFractionDigits(2);
		String priceString = currency.format(price);
		return priceString;
	}
	
	public static String[] FormatCurrency(double price, double pricetwo) {
	    String[] priceArray = new String[2];
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		priceArray[0] = currency.format(price);
		NumberFormat currencyTwo = NumberFormat.getCurrencyInstance();
		priceArray[1] = currencyTwo.format(pricetwo);
	    return priceArray; 
	}	    
	
	public static String FormatDecimal(double miles) {
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(2);
		String mileString = number.format(miles);
		return mileString;
	}
	
	public static String[] FormatDecimal(double miles, double milestwo) {
	    String[] decimalArray = new String[2];
		NumberFormat number = NumberFormat.getNumberInstance();
		decimalArray[0] = number.format(miles);
		NumberFormat numberTwo = NumberFormat.getNumberInstance();
		decimalArray[1] = numberTwo.format(milestwo);
	    return decimalArray; 
		}	    		

	/**return a random number between two values, A and B (inclusive)
	see the previous assignment on Random numbers*/
	public static int FormatRandom(int A, int B) {
		Random r = new Random();
		//NumberFormat randomnum = NumberFormat.;
		//String randomnumString = r.r
		int randomnum = 1 + r.nextInt(A) + B;
		
				//rformat(Math.random() * A + B);
		return randomnum;
	}
	
	public static String FormatMax(double numone, double numtwo) {
		NumberFormat maxval = NumberFormat.getNumberInstance();
		String maxvalString = maxval.format(Math.max(numone, numtwo));
		return maxvalString;
	}
	
	public static String FormatMin(double numthree, double numfour) {
		NumberFormat minval = NumberFormat.getNumberInstance();
		String minvalString = minval.format(Math.min(numthree, numfour));
		return minvalString;
	}
	
}

	
	
	