package main;

public class Account {
	
	private int balance;

	public Account(int money) {
		balance = money;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int i) {
		this.balance += i;
	}

	public void withdraw(int i) {
		this.balance -= i;
	}


}
