package mock.exam;

class Caller {
//	public void init() {
	private void init() {
		System.out.println("Initialized");
	}

//	public void start() {
	private void start() {
		init();
		System.out.println("Started");
	}
}

class Q8 {
	public static void main(String[] args) {
		Caller c = new Caller();
//		c.start();
//		c.init();
	}
}
