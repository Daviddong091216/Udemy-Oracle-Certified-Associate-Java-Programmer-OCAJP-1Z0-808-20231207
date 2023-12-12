package mock.exam;

public class Q19 {
//	void readCard(int cardNo) throws Exception {
	void readCard(int cardNo) throws RuntimeException {
		System.out.println("Reading Card");
	}

	void checkCard(int cardNo) throws RuntimeException {
		System.out.println("Checking Card");
	}

//	public static void main(String[] args) throws Exception {
	public static void main(String[] args) {
		Q19 ex = new Q19();
		int cardNo = 12344;
		ex.readCard(cardNo);
		ex.checkCard(cardNo);
	}
}