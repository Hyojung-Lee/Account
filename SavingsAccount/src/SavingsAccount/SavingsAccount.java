package SavingsAccount;
public class SavingsAccount extends Account {
	private double interest;
	private int months=0;
	public SavingsAccount(double balance,double interest){
		this.balance = balance;
		this.interest = interest;
	}
	double getWithdrawableAccount() {
		if(months<=12){
			return 0;
		}
		else
			return balance;
	}
	
	@Override
	public double debit(double b){
		if(months<=12){
			System.out.println("아직 출금할 수 없습니다.");
			return 0;
		}
		else
			balance -=b;
			return balance;
	}
	void passTime(int a){
		months=months+a;
		if(months==12)
			balance=balance*Math.pow(1+interest,months);
	}
}