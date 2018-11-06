import java.util.Locale;
import java.util.Scanner;

import Util.CurrencyConverter;

public class Program4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		System.out.print("what is dollar price?");
		double price = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double cash = sc.nextDouble();

		System.out.printf("Amount to be paid in reais %.2f%n", CurrencyConverter.painInReais(price, cash));

		sc.close();
	}

}
