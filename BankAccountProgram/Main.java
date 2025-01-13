package BankAccountProgram;

public class Main {
    public static void main(String[] args) {
        //create an object of bankAccount class
        bankAccount account = new bankAccount(2612, 1000);


        //Display initial account details
        account.displayAccountDetails();

        //performing a deposit operation
        account.deposit(500);

        //performing a withdraw operation
        account.withdraw(300);

        //attempting to withdraw more than the  account balance
        account.withdraw(2000);

        //attempting to withdraw negative amount
        account.withdraw(-500);

        //display the final account account details
        account.displayAccountDetails();

    }



}
