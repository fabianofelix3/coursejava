package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;
	private double tax;

	public Account() {
	}

	public Account(int number, String holder, double initialdeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialdeposit);
		this.tax = 5.0;
	}

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
		this.tax = 5.0;
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		this.balance += amount;

	}

	public void withdraw(double amount) {
		this.balance -= (amount + tax);
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
}
}
