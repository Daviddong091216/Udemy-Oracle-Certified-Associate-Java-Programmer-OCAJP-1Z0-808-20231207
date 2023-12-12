package mock.exam;

public class Q23 {
	public static void main(String[] args) {
		int x = 100;
		int a = x++; // x++ makes x=101 but returns old value so a =100
		int b = ++x;// ++x makes x=102 and returns new value so b=102
		int c = x++;// x++ makes x=103 but returns old value so c =102
		int d = (a < b) ? (a < c) ? a : (b < c) ? b : c : x;
		// a<b=true-->(a<c)=true-->d=a
		System.out.println(d);

		int d2 = (b < c) ? b : c;
		// a<b=true-->(a<c)=true-->d=a
		System.out.println(d2);
		int d3 = (a < c) ? a : c;
		// a<b=true-->(a<c)=true-->d=a
		System.out.println(d3);

		int d4 = (a < b) ? a : x;
		// a<b=true-->(a<c)=true-->d=a
		System.out.println(d4);
		int d5 = (a > b) ? a : x;
		// a<b=true-->(a<c)=true-->d=a
		System.out.println(d5);

	}
}
