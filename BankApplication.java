import java.util.Scanner;

public class BankApplication
{
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1-> Saving account ");
        		System.out.println( "2-> Current account ");
        		System.out.println( "3-> Fixed deposit");
         System.out.println("Enter your choice :");
         
        int choice =Integer.parseInt(sc.next());

        switch(choice)
        {
            case 1 :
            {
            	System.out.println("Enter your name :");
                String name = sc.next();
                
                System.out.println("Enter your account Number :");
                String number = sc.next();
                System.out.println("Enter your balance :");
                double balance = Double.parseDouble(sc.next());

                BankAccount sa = new SavingAccount(name,number,balance);
                sa.displayAccountDetails();
                sa.calculateInterest();
            }
            break;

            case 2:
            {

            	System.out.println("Enter your name :");
                 String name = sc.next();
                 
                 System.out.println("Enter your account Number :");
                String number = sc.next();
                System.out.println("Enter your balance :");
                double balance = Double.parseDouble(sc.next());
                BankAccount bs = new CurrentAccount(name,number,balance);
                bs.displayAccountDetails();
                bs.calculateInterest();
//                bs.checkOverdraftLimit();
                CurrentAccount ca = (CurrentAccount)bs;

            }
            break;

            case 3 :
            {
            	System.out.println("Enter your name :");
                String name = sc.next();
                
                System.out.println("Enter your account Number :");
                String number = sc.next();
                
                System.out.println("Enter your balance :");
                double balance = Double.parseDouble(sc.next());
                System.out.println("Enter your deposit term :");
                int depositTerm = sc.nextInt();
                BankAccount bb = new FixedDeposit(name,number,balance,depositTerm);
                bb.displayAccountDetails();
                bb.calculateInterest(); 
            }
            break;
            default :
            {
                System.out.println("limitation buddy");
            }
        }
        sc.close();
    }
}



