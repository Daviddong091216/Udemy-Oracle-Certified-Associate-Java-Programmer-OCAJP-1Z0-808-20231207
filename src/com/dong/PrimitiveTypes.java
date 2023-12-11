package com.dong;

public class PrimitiveTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 1;
		short s;
		s = 2;
		long l2 = 2_000_000_000;
		long l3 = 2_000_000_000_000_000L;

		float f1 = (float) 1.2;
		float f2 = 1.2F;
		float f3 = 1.2f;

		char c1 = 'a';
		char c2 = 100;
		System.out.println(c2);
		char c3 = 1000;
		System.out.println(c3);
		//
		// overfloat
		byte b2 = (byte) 130;
		System.out.println(b2);

		int hex = 0x98;
		System.out.println(hex);
	}

}
