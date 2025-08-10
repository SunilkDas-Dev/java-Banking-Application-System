
public class FixedDeposit extends SavingAccount {

    protected double interestRate = 6.5;
    protected int depositTerm;

    public FixedDeposit(String accountHolderName,String accountNumber,double balance,int depositTerm)
    {
    super( accountHolderName, accountNumber, balance);
    if(depositTerm<0)
    {
        System.out.println("Deposit term must be positive.");
        System.exit(0);
    }
    this.depositTerm = depositTerm;
    }

    public void calculateInterest()
    {
        System.out.println("Fixed Deposit Interest for "+depositTerm+" years RS :"+(super.balance*interestRate/100*depositTerm));
    }
    
    
}


