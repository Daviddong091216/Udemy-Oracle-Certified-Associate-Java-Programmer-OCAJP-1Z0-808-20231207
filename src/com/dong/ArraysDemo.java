package com.dong;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr;
		arr = new int[10];
		// System.out.println(arr);
		// System.out.println(arr[0]);

		int[] arr2;
		// arr2= {1,2,3};

		int[] arr3 = { 1, 2, 3 };
		// System.out.println(arr3);
		// System.out.println(arr3[1]);

		byte[] b = new byte[10];
		System.out.println(b[0]);
		short[] s = new short[10];
		System.out.println(s[0]);
		int[] i = new int[10];
		System.out.println(i[0]);
		long[] l = new long[10];
		System.out.println(l[0]);
		float[] f = new float[10];
		System.out.println(f[0]);
		double[] d = new double[10];
		System.out.println(d[0]);
		char[] c = new char[10];
		System.out.println(c[0]);
		boolean[] b2 = new boolean[10];
		System.out.println(b2[0]);

		int[][] m = new int[3][5];
		System.out.println(m);
		int[][] m2 = { { 1, 2, 3 }, { 4, 5, 6 } };
		System.out.println(m2[0][0]);

		int[] arr5 = { 3, 2, 1 };
		System.out.println(arr5);
		System.out.println(Arrays.toString(arr5));
		Arrays.sort(arr5);
		System.out.println(Arrays.toString(arr5));

	}

}
