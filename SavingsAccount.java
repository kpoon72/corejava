package oopproj;

public class SavingsAccount {
//fields or instance variables or non-static variables
	int accountNo;
	float balance;
	int pin;
	
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(int accountNo, float balance, int pin) {
		this.accountNo = accountNo;
		this.balance = balance;
		this.pin = pin;
	}
	
	public void deposit(int amount) {
		balance=balance + amount;
		System.out.println("New balance: "+balance);
	}
	
	public void withdraw(int withdrawalAmount) {
		if(withdrawalAmount <= balance) {
			balance= balance-withdrawalAmount;
			System.out.println("Balance after withdrawal :  "+balance);
		}
		else {
			System.out.println("You have insufficeint funds....");
		}
	}

}
