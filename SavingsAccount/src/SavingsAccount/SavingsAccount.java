
public class SavingsAccount extends Account {
	private double interest;
	private int a;
	public SavingsAccount(double balance,double interest){
		this.balance = balance;
		this.interest = interest;
	}
	double getWithdrawableAccount() {
		if(a<=12){
			System.out.printf("아직 출금할 수 없습니다.");
			return 0;
		}
		else
			return balance;
	}
	void passTime(int a) {
		if(a>12){
			balance=balance*Math.pow(1+interest, a);
		}
	}

}
