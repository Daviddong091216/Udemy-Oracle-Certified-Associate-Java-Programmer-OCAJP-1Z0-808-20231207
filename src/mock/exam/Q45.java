package mock.exam;

import java.util.ArrayList;

public class Q45 {
	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		String[] myArray;
		try {
			while (true) {
				System.out.println(" ----");
				myList.add("My string");
			}
		} catch (RuntimeException e) {
			System.out.println("Caught a RuntimeException");
		} catch (Exception e) {
			System.out.println("Caught an Exception");
		}
		System.out.println("Ready to use");
	}
}
