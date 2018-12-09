import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import entities.EmployeeComparable;

public class ProgramComparable {

	public static void main(String[] args) {
		List<EmployeeComparable> list = new ArrayList<>();
		String path = "C:\\temp\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employeeCsv = br.readLine();

			while (employeeCsv != null) {
				String[] fields = employeeCsv.split(",");
				list.add(new EmployeeComparable(fields[0], Double.parseDouble(fields[1])));
				employeeCsv = br.readLine();
			}

			list.sort((p1, p2) -> p1.getName().toUpperCase()
					.compareTo(p2.getName().toUpperCase()));
			for (

			EmployeeComparable emp : list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}