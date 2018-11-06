import java.util.Locale;
import java.util.Scanner;

import Entites.Estudent;

public class Program3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Estudent Student = new Estudent();
		
		System.out.print("Name:");
		Student.name = sc.nextLine();
		System.out.print("Grade 1:");
		Student.grade1 = sc.nextDouble();
		System.out.print("Grade 2:");
		Student.grade2 = sc.nextDouble();
		System.out.print("Grade 3:");
		Student.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", Student.finalGrade());
		if (Student.finalGrade() < 60 ) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", Student.missingPoints());
		} else {
            System.out.println("PASS"); 
		}
		sc.close();
	}

}
