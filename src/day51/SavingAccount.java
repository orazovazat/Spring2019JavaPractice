package day51;

public class SavingAccount extends BankAccount {

	double returnRate;

	public SavingAccount(double returnRate , String accountName, long accountNumber, double balance) {
		super(accountName, accountNumber, returnRate);
		this.returnRate = returnRate;
	}

	@Override
	public String toString() {
		return "SavingAccount [returnRate=" 
	            + returnRate + ", accountName="
				+ accountName + ", accountNumber="
				+ accountNumber + ", balance="
				+ balance + "]";
	}

	@Override
	public void deposit(int money) {

		this.balance += money;
		this.balance += 100;

	}

	@Override
	public void withdraw(int money) {

		this.balance = this.balance - money - 10;

	}

}
