package com.dong;

import java.util.ArrayList;
import java.util.Arrays;

public class Basic1 {
	private static int $;
	private static String str1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object a = new Object();
		String s = new String();
		int b = 10;
		System.out.println(a == s);
//		System.out.println(a==b);
		String s2 = "Hello";
		System.out.println(s2.length());
		int[] arr = { 1, 2, 3 };
		System.out.println(arr.length);
		// System.out.println(arr.size());

		int[][] int1 = new int[3][6];
		int1[0][0] = 9;
		System.out.println(Arrays.toString(int1[0]));
		System.out.println("abc" + 5 + 6);
		System.out.println(5 + 6 + "abc");

		int i2 = 4;
		if (++i2 < 5) {
			System.out.println("Hie");
		} else {
			System.out.println("Bye");
		}

		byte b2 = 6;
//		String s4=(String)(b2);
//		String s4=(String)(b);

		StringBuilder db = new StringBuilder("hello");
		String d = "hello";
		// System.out.println(db==d);
		System.out.println(db.equals(d));
		System.out.println(db);
		System.out.println(db.toString());
		System.out.println(db.toString().equals(d));

		System.out.println("=================");
		String s1 = "A";
		s1 = s1.concat("B");
		s1 = s1.concat(s1);

		System.out.println(s1);
		String s3;
		// System.out.println(s3);

		System.out.println($);
//		int _;
		System.out.println(5_6);
		System.out.println(str1);
		System.out.println("=================");
		System.out.println(args.length);
		System.out.println("=================");
		StringBuilder db2 = new StringBuilder("hello");
//		db3=db2.toString();
//		System.out.println(db2.toString()==db2);
		System.out.println(db2.toString().equals(db2));
		System.out.println("=================");
		ArrayList<Integer> al = new ArrayList<>();
		al.add(0);
		System.out.println(al);
		al.add(1, 9);
		System.out.println(al);
		al.add(1, 1);
		System.out.println(al);
		al.set(1, 10);
		System.out.println(al);
		System.out.println(al.size());

//		Object ob1 = new Integer(5);
//		Number n1 = new Byte(1);

		Boolean[] b1 = new Boolean[5];
		System.out.println(b1[0]);

		boolean[] b3 = new boolean[2];
		System.out.println(b3[0]);

	}

}
