import java.util.Scanner;

public class AccountTest{
	public static void main(String args[]){
		Account account1 = new CheckingAccount(100,50,0.01,0.07);
		Account account2 = new SavingsAccount(100,0.05);
		
		//CheckingAccount
		Scanner scan = new Scanner(System.in;
		double amount;
		
		System.out.printf("Account1 balance: $ %.2f \t현재출금가능액: %.f\n",account1.getBalance(),account1.getWithdrawableAccount());)
	}
}