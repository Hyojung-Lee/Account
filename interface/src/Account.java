
public abstract class Account implements Valuable {
	protected double balance;
	public double getBalance(){
		return balance;
	}
	protected void setBalance(int balance){
		this.balance=balance;
	}
	public double credit(int b){
		balance +=b;
		return balance;
	}
	public double debit(double amount){
		balance -=amount;
		if(balance<0){
			System.out.printf("Not Enough Money!\n");
			balance +=amount;
			return 0;
		}
		else
			return balance;
	}
	public void balanceCheck(){
		System.out.printf("Current Balance:");
		System.out.println(balance);
	}
	abstract double getWithdrawableAccount();
	abstract void passTime(int a);
}