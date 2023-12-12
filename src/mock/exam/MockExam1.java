package mock.exam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MockExam1 {
	public static void main(String[] args) {
//		String date = LocalDate.parse("2023-12-12").format(DateTimeFormatter.ISO_DATE_TIME);
		String date = LocalDate.parse("2023-12-12").format(DateTimeFormatter.ISO_DATE);
		System.out.println(date);
		short s1 = 200;
//		String s2 = (String) s1;

		StringBuilder sb1 = new StringBuilder("Java");
		String s3 = "Java";
		System.out.println(sb1.toString().equals(s3.toString()));
		System.out.println(sb1.toString() == s3.toString());
		System.out.println(sb1.toString());
		System.out.println(s3.toString());

		String ta = "A";
		ta = ta.concat("B");
		System.out.println(ta);
		ta.replace('B', 'C');
		System.out.println(ta);
		ta = ta.concat("D");
		System.out.println(ta);

//		int a[] = { 1, 2, 3, 4, 5 };
		int[] a = { 1, 2, 3, 4, 5 };
		for (int e = 0; e < 5; e += 2) {
			System.out.print(a[e]);
		}
		System.out.println("========================================");
		int[] arr3 = new int[2];
		arr3[0] = 10;
		arr3[1] = 20;
		System.out.println(arr3[0] + ":" + arr3[1]);
		System.out.println("========================================");
		String[] arr = { "A", "B", "C", "D" };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
			if (arr[i].equals("A")) {
				continue;
			}
			System.out.println("Work done");
			break;
		}
		System.out.println("========================================");

		String[] planets = { "Mercury", "Venus", "Earth", "Mars" };
		System.out.println(planets.length); // 4 elements in the array
		System.out.println(planets[1].length()); // Venus - 5 characters

		System.out.println("========================================");

	}

}
