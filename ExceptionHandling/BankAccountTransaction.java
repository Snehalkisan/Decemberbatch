package ExceptionHandling;

public class BankAccountTransaction {
// initialise attributes of bank account transaction
     private int accountNumber;
   private  double balance;

//create the constructor of BankAccountTransaction class
    public BankAccountTransaction(int accountNumber,double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;


    }

// to deposit an amount to account create deposit method
    public void deposit(double amount){
        balance +=amount;
        System.out.println("Deposited amount: "+amount+", New balance: "+balance);
    }
    // to withdraw an amount from account create withdraw method
    public void withdraw( double amount){
         try {
             if (amount > balance) {
                 throw new IllegalArgumentException("Check your balance");

             }
             balance -=amount;
             System.out.println("=======================================================");
             System.out.println("withdraw amount: " + amount + " ,New balance: " + balance);
         }
         catch (IllegalArgumentException e){
             System.out.println("=======================================================");
             System.out.println("Amount is more than the current balance.  " + e.getMessage());
         }


    }

    public static void main(String[] args) {

        // create instance of BankAccountTransaction

        BankAccountTransaction account = new BankAccountTransaction(5623, 5000);

        System.out.println("=======================================================");
        System.out.println("Depositing an amount to account: ");
        account.deposit(2000);

        System.out.println("=======================================================");
        System.out.println("Withdrawing an amount available in balance");
        account.withdraw(1000);

        System.out.println("=======================================================");
        System.out.println("Withdrawing an amount beyond the  balance");
        account.withdraw(8000);



    }
}
