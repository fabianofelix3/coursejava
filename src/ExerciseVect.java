import java.awt.image.renderable.RenderableImage;
import java.text.ParseException;

import java.util.Scanner;

import entities.Product;
import entities.Rent;

public class ExerciseVect {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		Rent[] vect = new Rent[10];
		System.out.println("Honw manny rooms will be rented? ");
		int n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			System.out.println();
			System.out.println("rent #" + i + ":");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Rooms: ");
			int room = sc.nextInt();
			vect[room] = new Rent(name, email);

		}
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ":" + vect[i]);
			}
		}

		sc.close();
	}

}
