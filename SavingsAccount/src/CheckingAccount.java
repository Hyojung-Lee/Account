public class CheckingAccount extends Account {
	private int credit_limit;
	private double interest;
	private double loan_interest;
	public CheckingAccount(double balance,int credit_limit, double interest, double loan_interest){
		this.balance = balance;
		this.credit_limit = credit_limit;
		this.interest = interest;
		this.loan_interest = loan_interest;
	}
	@Override
	public double debit(int b){
		balance -=b;
		if(balance<0){
			System.out.printf("Below Zero!\n");
		}
		if(b>credit_limit){
			System.out.printf("Credit limit Exceeded!");
			balance +=b;
			return 0;
		}
		else
			return balance;
		
	}
	public void nextMonth(){
		if(balance>=0)
			balance=balance+balance*interest;
		else
			balance=balance+balance*loan_interest;
	}
};