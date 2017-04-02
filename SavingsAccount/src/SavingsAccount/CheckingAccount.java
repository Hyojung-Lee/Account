package SavingsAccount;
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
	public double debit(double b){
		if(b>getWithdrawableAccount()){
			System.out.println("Credit limit Exceeded!");
			return 0;
		}
		else
			balance -=b;
			return balance;
		
	}
	public void nextMonth(){
		if(balance>=0)
			balance=balance+balance*interest;
		else
			balance=balance+balance*loan_interest;
	}
	double getWithdrawableAccount(){
		return balance+credit_limit;
	}
	void passTime(int a){
		for(int i=0;i<a;i++)
			nextMonth();
	}
};
