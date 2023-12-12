package mock.exam;

public class Q42 {
	public static String maskCC(String creditCard) {
		String x = "XXXX-XXXX-XXXX-";
		return x + creditCard.substring(15, 19);
	}

	public static String maskCC2(String creditCard) {
		String x = "XXXX-XXXX-XXXX-";
		StringBuilder sb = new StringBuilder(x);
		sb.append(creditCard, 15, 19);
		return sb.toString();
	}

	public static String maskCC3(String creditCard) {
		String x = "XXXX-XXXX-XXXX-";
		StringBuilder sb = new StringBuilder(creditCard);
//		sb.substring(15, 19);
		return x + sb.substring(15, 19);
	}

	public static void main(String[] args) {
		System.out.println(maskCC("1234-5678-9101-1121"));
		System.out.println(maskCC2("1234-5678-9101-1121"));
		System.out.println(maskCC3("1234-5678-9101-1121"));
	}
}
