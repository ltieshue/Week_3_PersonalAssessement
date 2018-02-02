package com.company;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(double balance, double withdraw, double deposit) {
        super(balance, withdraw, deposit);

       CheckingAccount.this.deposit(500);
       CheckingAccount.this.withdraw(550);

        System.out.println("Checking Account/Deposit: $ " + this.Deposit + ": Withdraw: $ " + this.Withdraw + ": New Balance: $" + this.Balance);
    }

    @Override
    public void withdraw (double amount){
        if (amount>this.Balance){
        Balance -= amount;
        Balance -= 25;
        System.out.println("Overdraft fee of $25 applied!");

            }//end of if statement
            else {
            this.Balance -= amount;
        } ////end of else statement

    }
}


