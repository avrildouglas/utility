package utilclass;

import java.text.NumberFormat;

public class Number {
	
	public static String FormatPercentage(double majority) {
		NumberFormat percent = NumberFormat.getPercentInstance();
		String majorityString = percent.format(majority);
		return majorityString;
	}
	
	public static String FormatPercentage(double majority, double twodec) {
		NumberFormat percentone = NumberFormat.getPercentInstance();
		percentone.setMaximumFractionDigits(2);
		String majorityString = percentone.format(majority);
		NumberFormat percenttwo = NumberFormat.getPercentInstance();
	//	percenttwo.setMaximumFractionDigits();
		String twodecString = percenttwo.format(twodec);
		return majorityString;
		return twodecString;
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
	public static String FormatRandom(double A, double B) {

		NumberFormat randomnum = NumberFormat.getNumberInstance();
		String randomnumString = randomnum.format(Math.random() * A + B);
		return randomnumString;
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
}

