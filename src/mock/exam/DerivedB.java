package mock.exam;

class Base {
	public void test() {
		System.out.println("Base ");
	}
}

public class DerivedB extends DerivedA {
	public void test() {
		System.out.println("DerivedB ");
	}

	public static void main(String[] args) {
		Base b1 = new DerivedB();
		b1.test();
		Base b2 = new DerivedA();
		b2.test();
		Base b3 = new DerivedB();
		b3.test();
		b1 = (Base) b3;
		Base b4 = (DerivedA) b3;
		b1.test();
		b4.test();

		Base b5 = new Base();
		b5.test();
	}
}
