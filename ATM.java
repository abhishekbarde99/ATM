import java.util.*;
public class ATM
{
	public static void main(String args[])
	{
				int balance=100000,withdraw,deposit;
				Scanner sc=new Scanner(System.in);
				
				while(true)
				{
					
						System.out.println("Automated teller machine");
						System.out.println("Choice 1 for Withdraw");
						System.out.println("choice 2 for Deposite");
						System.out.println("choice 3 for check Balance");
						System.out.println("choice 4 for Exit");
						System.out.println("choice the operation you want to perform");
					
					int choice=sc.nextInt();
					switch(choice)
					{
						case 1:
						System.out.println("Enter money to be withdrawn");
						
						withdraw=sc.nextInt();
						if(balance>=withdraw)
						{
							
							balance=balance-withdraw;
							System.out.println("please collect your money");
				
						}
						else
						{
							System.out.println("insufficient balance");
							
					    }
					System.out.println("");
					break;
					
					case 2:
					System.out.println("Enter money to be deposite");
					
					deposit=sc.nextInt();
					balance=balance+deposit;
					System.out.println("Your money to be succesfully deposite");
					System.out.println("");
					break;
				
				case 3:
				
				System.out.println("Balance"+balance);
				System.out.println("");
				break;
				
				case 4:
				System.exit(0);
				
					}
				}
	}
}