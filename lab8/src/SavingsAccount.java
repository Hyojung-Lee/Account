import java.util.InputMismatchException;

public class SavingsAccount extends Account implements Valuable{
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
	public void debit(double b) throws Exception{
		if(months<=12){
			 throw new Exception("아직 출금할수 없습니다!");
		}
		else if (b<0){
			throw new Exception("음수!");
		}
		else if(b>getWithdrawableAccount()){
			 throw new Exception("한도초과!");
		}
		else{
			throw new InputMismatchException();
		}
	}
	void passTime(int a){
		months=months+a;
		if(months==12)
			balance=balance*Math.pow(1+interest,months);
	}
	void passTime(){
		months=months+1;
		if(months==12)
			balance=balance*Math.pow(1+interest,months);
}
	@Override
	public double EstimateValue(int month) {
		return balance*Math.pow(1+interest,months);
	}
	@Override
	public double EstimateValue() {
		return balance*Math.pow(1+interest,months);
	}
}