import java.util.InputMismatchException;

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
	public void debit(double amount) throws Exception{
		if (amount<0){
			throw new Exception("음수!");
		}
		else if(balance - amount >= -credit_limit){
			super.debit(amount);
		}
		else if(amount>getWithdrawableAccount()){
			 throw new Exception("한도초과!");
		}
		else{
			throw new InputMismatchException();
		}
		
	}
	public void nextMonth(){
		if(balance>=0)
			balance=balance+balance*interest;
		else
			balance=balance+balance*loan_interest;
	}
	double getWithdrawableAccount(){
		if(isBankrupted()){
			System.out.println("Bankrupted!");
			return 0;
		}
		else
			return balance+credit_limit;
	}
	void passTime(int a){
		for(int i=0;i<a;i++)
			nextMonth();
	}
	boolean isBankrupted(){
		return balance<-credit_limit;
	}
};
