package entities;

import exceptions.DomainException;

public class Account3 {

	private int number;
	private String holder;
	private double balance;
	private Double withdrawLimit;;

	public Account3() {
	}

	public Account3(int number, String holder, double balance, double whithdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = whithdrawLimit;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
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

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void whithdraw(double amount) {
		if (amount > withdrawLimit) {
			throw new DomainException("The amount exceeds limit");
		}
		if (amount > balance) {
			throw new DomainException("The enough balance");
		}
		balance -= amount;
	}
}
