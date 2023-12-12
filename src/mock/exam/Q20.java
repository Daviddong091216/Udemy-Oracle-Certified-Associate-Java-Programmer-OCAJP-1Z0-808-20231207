package mock.exam;

public class Q20 {
	public static void main(String[] args) {
		int x = 5;
		while (isAvailable(x)) {
			System.out.print(x);
			x--; // Answer B - Its ok.
		}
	}

	public static boolean isAvailable(int x) {
//		return x-- > 0 ? true : false;
//		return x > 0 ? true : false;
		return --x > 0 ? true : false;

	}
}
