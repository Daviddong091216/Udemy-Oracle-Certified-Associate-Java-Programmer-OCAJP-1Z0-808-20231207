package mock.exam;

class A {
	public A() {
		System.out.println("A ");
	}
}

class B extends A {
	public B() {
		super();
		System.out.println("B ");
	}
}

class Q27 extends B {
	public Q27() {
		super();
		System.out.println("C ");
	}

	public static void main(String[] args) {
		Q27 c = new Q27();
	}
}
