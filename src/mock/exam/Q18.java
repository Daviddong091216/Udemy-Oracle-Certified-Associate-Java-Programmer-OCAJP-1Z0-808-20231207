package mock.exam;

class Q18 {
	public static void main(String[] args) {
		String shirts[][] = new String[2][2];
//shirts[3][1] = "red"; //java.lang.ArrayIndexOutOfBoundsException

		shirts[0][0] = "red";
		shirts[0][1] = "blue";
		shirts[1][0] = "small";
		shirts[1][1] = "medium";
//		for (String[] c : shirts) { // red:blue:small:medium:
//			for (String s : c) {
//				System.out.println(s + ":");
//			}
//		}
//		for (int index = 0; index < 2; index++) { // red: blue: java.lang.ArrayIndexOutOfBoundsException
//			for (int idx = 0; idx < 2; idx++) {
//				System.out.println(shirts[index][idx] + ":");
//
//			}
//
//		}

//		for (int index = 0; index < 2; ++index) { // red: blue: java.lang.ArrayIndexOutOfBoundsException
//			for (int idx = 0; idx < 2; ++idx) {
//				System.out.println(shirts[index][idx] + ":");
//			}
//		}
//		for (int index = 0; index < 2; ++index) { // red: blue: java.lang.ArrayIndexOutOfBoundsException
//			for (int idx = 0; idx < index; ++idx) {
//				System.out.println(shirts[index][idx] + ":");
//			}
//		}
		for (int index = 0; index < 2;) { // red: blue: java.lang.ArrayIndexOutOfBoundsException
			for (int idx = 0; idx < 2;) {
				System.out.println(shirts[index][idx] + ":");
				idx++;
			}
			index++;
		}

	}
}
