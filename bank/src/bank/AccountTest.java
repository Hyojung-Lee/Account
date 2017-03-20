package bank;
 
import java.util.Scanner;
 
public class AccountTest {

	public static void main(String[] args){
		int balance=0;
		
		Scanner sc = new Scanner(System.in);
		Account account1 = new Account();
		Account account2 = new Account();
		while(true){
			System.out.println("Select Account:");
			int num = sc.nextInt();
			int service=0;
			if(num!=1 && num!=2)
				System.out.println("NO ACCOUNT!");
			if(num == 1){
				System.out.println("Service: 1.Credit 2.Debit 3.Balance 4.Quit");
				service = sc.nextInt();
				if(service == 1){
					account1.credit();
				}
				if(service == 2){
					account1.debit();
				}
				if(service == 3){
					account1.balance();
				}
				if(service == 4){
					break;
				}
			}
			if(num == 2){
				System.out.print("Service: 1.Credit 2.Debit 3.Balance");
				service = sc.nextInt();
				if(service == 1){
					account2.credit();
				}
				if(service == 2){
					account2.debit();
				}
				if(service == 3){
					account2.balance();
				}
				if(service == 4){
					break;
				}
			}
		}	
	}
}




