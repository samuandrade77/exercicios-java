package util;

public class CurrencyConverter { 
	public static double convert(double price, double bought) {
		return price * bought + (price * bought * 6/100);}
}
