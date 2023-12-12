package mock.exam;

public class Q25 {
	String name;
	Boolean contract;
	double salary;

	Q25() {
// Line n1 - Option C
		/*
		 * this.name = new String("Joe"); this.contract = new Boolean(true); this.salary
		 * = new Double(100);
		 */
//		this.name = new String("Joe");
//		this.contract = new Boolean(true);
//		this.salary = new Double(100);
//		name = "Joe";
//		contract = true;
//		salary = 100;
//		this("Joe");

	}

	public String toString() {
		return name + " : " + contract + " : " + salary;
	}

	public static void main(String[] args) {
		Q25 e = new Q25();
// Line n2 - Option A
		/*
		 * e.name = "Joe"; e.contract = true; e.salary = 100;
		 */
//		e.name = "Joe";
//		e.contract = true;
//		e.salary = 100;

// Line n2 - Option B
		/*
		 * this.name = "Joe"; this.contract = true; this.salary = 100;
		 */
//		this.name = "Joe"; this.contract = true; this.salary = 100;

		System.out.print(e);
	}
}
