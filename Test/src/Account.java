
public abstract class Account {
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
	public void debit(double amount) throws Exception{
		balance -=amount;
	}
	public void balanceCheck(){
		System.out.printf("Current Balance:");
		System.out.println(balance);
	}
	public double EstimateValue(){
		return balance;
	}
	public double EstimateValue(int month){
		return balance;
	}
	abstract double getWithdrawableAccount();
	abstract void passTime(int a);
	abstract void passTime();
	
}