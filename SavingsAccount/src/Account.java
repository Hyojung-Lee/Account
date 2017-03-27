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
	public double debit(int b){
		balance -=b;
		if(balance<0){
			System.out.printf("Not Enough Money!\n");
			balance +=b;
			return 0;
		}
		else
			return balance;
	}
	public void balanceCheck(){
		System.out.printf("Current Balance:");
		System.out.println(balance);
	}
}
