import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entites.EmployeeList;

public class ExerciseList {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<EmployeeList> list = new ArrayList<>();

		// PART 1 - READING DATA:

		System.out.print("How many employees  will be registered? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new EmployeeList(id, name, salary));
		}

		// PART 2 -UPDATE SALARY AND GIVEN EMPLOYEE:

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		EmployeeList emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (emp == null) {
			System.out.println("This Id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}

		// PART 3 - LISTING EMPLOYEES:
		System.out.println();
		System.out.println("List of  Emoloyees:");

		for (EmployeeList obj : list) {
			System.out.println(obj);
		}
		sc.close();
	}

}
