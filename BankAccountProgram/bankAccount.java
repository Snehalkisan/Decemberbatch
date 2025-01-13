package BankAccountProgram;

public class bankAccount {
    //Private fields to store account details
    private int accountNumber;
    private double balance;

    // create constructor to initialise the accountNumber and balance
     bankAccount(int accountNumber, double balance)
    {   //assigned values to accountNumber field using this keyword
        this.accountNumber = accountNumber;
        //assigned values to balance field using this keyword
        this.balance = balance;
    }

    //Method to deposit money into the balance
    public void deposit(double amount) {
        if (amount > 0)  //check if the deposit amount is positive
        {
            balance += amount; //adding amount to balance
            System.out.println("Deposited: " + amount + ",New Balance: " + balance);
        } else {
            System.out.println("Deposit amount should be positive");
        }
    }


    //Method to withdraw money into the account
    public void withdraw(double amount) {
        if (amount > 0)//check if the withdraw amount is positive
        {
            if (balance >= amount)//check if the sufficient balance available
            {
                balance -= amount;//deposit amount from balance
                System.out.println("withdraw: " + amount + " ,New Balance: " + balance);
            } else {
                System.out.println("Insufficient funds. Available balance is: " + balance);
            }
        } else {
            System.out.println("Withdraw amount should be positive");
        }
    }

    // method to display the account Details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: " + balance);
    }


}