package bank;
import java.util.Scanner;
 
public class Account {
	private int balance;
	public int getBalance(){
		return balance;
	}
	public void setBalance(int balance){
		this.balance=balance;
	}
	
	
	public void credit(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Adding amount");
		int add = sc.nextInt();
		balance = balance + add;
		System.out.printf("Adding %d to account...\n",add);
		System.out.printf("Balance: %d\n",balance);
	}
	public void debit(){
		if(balance<=0){
			System.out.println("NO MONEY TO WITHDRAW!");
		}
		if(balance>0){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Withdrawal amount");
			int wit = sc.nextInt();
			if(wit>balance)
				System.out.println("NOT ENOUGH MONEY!");
			if(wit<=balance){
				balance = balance - wit;
				System.out.printf("Withdrawing %d from account...\n",wit);
			}
			System.out.printf("Balance: %d\n",balance);
		}
	}
	public void balance(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Balance : ");
		System.out.println(balance);
	}
}
