package mock.exam;

public class Q17 {
	public int amount;

	public Q17(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void changeAmount(int x) {
		amount += x;
	}

	public static void main(String[] args) {
		Q17 acct = new Q17((int) (Math.random() * 1000));
		/*
		 * acct.amount = 0; System.out.println(acct.getAmount()); acct.setAmount(0);
		 * System.out.println(acct.getAmount()); acct.changeAmount(-acct.amount);
		 * System.out.println(acct.getAmount());
		 */
		acct.setAmount(-acct.getAmount());
		System.out.println(acct.getAmount());
//		acct.getAmount()=0;

	}
}
