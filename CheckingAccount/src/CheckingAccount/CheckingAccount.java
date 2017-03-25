package CheckingAccount;

public class CheckingAccount extends Account {
	private int credit_limit;
	private int interest;
	private int loan_interest;
	@Override
	public int debit(int b){
		balance() -=b;
		if(balance<0){
			System.out.printf("Not Enough Money!\n");
			balance +=b;
			return 0;
		}
		else
			return balance;
		
	}
	
};
