package Account2;
 
import java.util.Scanner;
 
public class AccountTest {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Account account1 = new Account();
		Account account2 = new Account();
		int a = 0,b=0;
		System.out.printf("Account1 Balance: ");
		a = sc.nextInt();
		account1.setBalance(a);
		System.out.printf("Account2 Balance: ");
		b = sc.nextInt();
		account2.setBalance(b);
		
		
		while(true){
			System.out.println("Select Account:");
			int num = sc.nextInt();
			int service=0;
			int amount=0;
			if(num!=1 && num!=2)
				System.out.println("NO ACCOUNT!");
			if(num == 1){
				System.out.println("Service: 1.Credit 2.Debit 3.Balance 4.Quit");
				service = sc.nextInt();
				if(service == 1){
					System.out.println("Credit Amount: ");
					amount = sc.nextInt();
					account1.credit(amount);
					System.out.println(account1.getBalance());
				}
				if(service == 2){
					System.out.println("Debit Amount: ");
					amount = sc.nextInt();
					account1.debit(amount);
					System.out.println(account1.getBalance());
				}
				if(service == 3){
					account1.balanceCheck();
				}
				if(service == 4){
					break;
				}
			}
			if(num == 2){
				System.out.println("Service: 1.Credit 2.Debit 3.Balance 4.Quit");
				service = sc.nextInt();
				if(service == 1){
					System.out.println("Credit Amount: ");
					amount = sc.nextInt();
					account2.credit(amount);
					System.out.println(account2.getBalance());
				}
				if(service == 2){
					System.out.println("Debit Amount: ");
					amount = sc.nextInt();
					account2.debit(amount);
					System.out.println(account2.getBalance());
				}
				if(service == 3){
					account2.balanceCheck();
				}
				if(service == 4){
					break;
				}
			}
		}	
	}
}