package mock.exam;

public class Q37 {
	public static void main(String[] args) {
		Q37 ts = new Q37();
		System.out.println(isAvailable + " ");
//		isAvailable = ts.doStuff();
		ts.doStuff();
		System.out.println(isAvailable);
	}

	public static boolean doStuff() {
		return !isAvailable;
	}

	static boolean isAvailable = false;
}
