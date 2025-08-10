
public class SavingAccount extends BankAccount {

    protected double interestRate = 0.04;

    public SavingAccount(String accountHolderName,String accountNumber,double balance)
    {
    super( accountHolderName, accountNumber, balance);
    }

    
    public void calculateInterest()
    {
        System.out.println("Savings Account Interest RS :"+(super.balance*interestRate));
    }
}



