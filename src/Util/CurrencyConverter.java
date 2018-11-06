package Util;

public class CurrencyConverter {
	public static final double iof = 0.06;

	public static double painInReais(double price, double cash) {
		double priceInDollar = cash/price;
		return priceInDollar - ( priceInDollar * iof );
	}
}
