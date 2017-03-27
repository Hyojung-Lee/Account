package CheckingAccount;

public class CheckingAccount extends Account {
	private int credit_limit=100;
	private double interest = 0.02;
	private double loan_interest = 0.03;
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