package oopproj;

public class Test {

	public static void main(String[] args) {
		SavingsAccount account = new SavingsAccount(101,5000,1234);
		/*
		 * account.accountNo=101; account.balance=5000; account.pin=1234;
		 */
		//
		SavingsAccount account2 = new SavingsAccount (102,10000,2345);
		
		/*
		 * account2.accountNo=102; account2.balance=10000; account2.pin=2345;
		 */
		
		//method call .. envoking method... when we call then it will execute
		account.deposit(1000);
		
		System.out.println("Account No : "+account.accountNo);
		System.out.println("Balance : "+account.balance);
		System.out.println("PIn  : "+account.pin);
		
		account2.withdraw(1000);
		System.out.println("Account No : "+account2.accountNo);
		System.out.println("Balance : "+account2.balance);
		System.out.println("PIn  : "+account2.pin);
	}

}
