
public class SavingsAccount {
	int balance;
	public SavingsAccount(int initialBalance) {
		balance = initialBalance;
	}
	public void checkBalance(){
		System.out.println("Hello!");
		System.out.println("Your balance is "+balance);    
		    }
	public void deposit(int amountToDeposit) {
		balance = balance + amountToDeposit;
		System.out.println("You just deposited "+amountToDeposit);
	}
	public void withdraw(int amountToWithdraw) {
		balance = balance - amountToWithdraw;
		System.out.println("You just withdrew "+amountToWithdraw);
	}
	public static void main(String[] args) {
		SavingsAccount savings = new SavingsAccount(2000);
		//check balance
		savings.checkBalance();
		//deposit
		savings.deposit(500);
		//check balance
		savings.checkBalance();
		//withdraw
		savings.withdraw(225);
		//checkbalance
		savings.checkBalance();

	}

}
