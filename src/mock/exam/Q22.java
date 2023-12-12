package mock.exam;

public class Q22 {
	public static void main(String[] args) {
		int num = 5;
//		do {
//			System.out.println(num-- + " ");
//		} while (num == 0);
		System.out.println("=============");
		do {
			System.out.println(num-- + " ");
		} while (num >= 0);
		System.out.println("=============");

		int num2 = 5;
		do {
			System.out.println(--num2 + " ");

		} while (num2 > 0);
		System.out.println("=============");
//		do {
//			System.out.println(num-- + " ");
//		} while (num == 0);
	}

}
