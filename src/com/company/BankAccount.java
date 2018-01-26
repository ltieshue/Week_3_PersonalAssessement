package com.company;

public class BankAccount {

    public double Balance;
    public double Withdraw;
    public double Deposit;

    public BankAccount(double balance, double withdraw, double deposit) {
        this.Balance = balance;
        this.Withdraw = withdraw;
        this.Deposit = deposit;
    }

    public void setBalance(double balance) {
        Balance = balance;

    }
    public void withdraw (double amount) {
        Balance = Balance - amount;
    }

    public void deposit (double amount){
        Balance = Balance + amount;
    }

}


