package com.company;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(double balance, double withdraw, double deposit) {
        super(balance, withdraw, deposit);

       SavingsAccount.this.deposit(500);
       SavingsAccount.this.withdraw(550);

        System.out.println(
               "Savings Account/Deposit: $ " + this.Deposit + ": Withdraw: $ " + this.Withdraw + ": New Balance: $" + this.Balance );

    }



    @Override
    public void withdraw (double amount) {
        if (this.Withdraw <= this.Balance)
        {     Balance = Balance - Withdraw;
    }
     else
         {       Balance=Balance;
        }
}}
