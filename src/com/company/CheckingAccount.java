package com.company;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(double balance, double withdraw, double deposit) {
        super(balance, withdraw, deposit);

       CheckingAccount.this.deposit(500);
       CheckingAccount.this.withdraw(550);

        System.out.println("Checking Account/Deposit: $ " + this.Deposit + ": Withdraw: $ " + this.Withdraw + ": New Balance: $" + this.Balance);
    }

    @Override
    public void withdraw (double amount) {
        if (this.Withdraw>this.Balance);
            {
        Balance = Balance - amount;
        Balance = Balance - 25;
        System.out.println("Overdraft fee of $25 applied!");

    }
}
    }

