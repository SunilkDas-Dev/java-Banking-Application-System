
public class BankAccount {
	 protected String accountHolderName;
	    protected String accountNumber;
	    protected double balance;
	    public static final String ifsc_code = "SBIN0002014";

	    public  BankAccount(String accountHolderName,String accountNumber,double balance)
	    {
	        if(accountHolderName == null || accountHolderName.isEmpty())
	        {
	            System.out.println("Account holder name cannot be empty.");
	            System.exit(0);
	        }
	        if(accountNumber == null ||accountNumber.isEmpty() )
	        {
	            System.out.println("Account number cannot be empty.");
	            System.exit(0);
	        }
	        if(balance <0)
	        {
	            System.out.println("Balance cannot be negative.");
	            System.exit(0);
	        }
	        this.accountHolderName=accountHolderName;
	        this.accountNumber= accountNumber;
	        this.balance = balance;
	    }
	    public void calculateInterest()
	    {

	    }

	    public void displayAccountDetails()
	    {
	        System.out.println("Account Holder: "+this.accountHolderName);
	        System.out.println("Account Number: "+this.accountNumber);
	        System.out.println("Balance RS :"+this.balance);
	        System.out.println("IFSC CODE :"+this.ifsc_code);

	    }
	     
	

}
