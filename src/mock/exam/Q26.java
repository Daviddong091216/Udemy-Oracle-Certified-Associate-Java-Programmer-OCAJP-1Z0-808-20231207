package mock.exam;

import java.util.ArrayList;
import java.util.List;

public class Q26 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Robb");
		names.add("Bran");
		names.add("Rick");
		names.add("Bran");
//		if (names.remove("Bran")) {
//			names.remove("Jon");
//		}
//		names.remove("Jon");
		if (names.remove("Bran")) {
			names.remove("Bran");
		}

		System.out.println(names);
	}
}
