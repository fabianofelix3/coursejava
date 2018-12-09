import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;

public class ProgramPredicate {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("Hd Case", 80.90));

		Predicate<Product> pred = p -> p.getPrice() >= 100.0;

		list.removeIf(pred);

		for (Product p : list) {
			System.out.println(p);
		}
	}
}