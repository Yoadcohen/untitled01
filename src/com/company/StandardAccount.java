package com.company;

public class StandardAccount implements IAccount {

    //state
    protected int accountnumber;
    protected double creditlimit;
    protected double Balance;

    public StandardAccount (int accountnumber, double creditlimit)
    {
        this.accountnumber = accountnumber;
        this.creditlimit = creditlimit;
        this.Balance = Balance;
    }

    //behaviour
    @Override
    public void Deposit(double amount) {
        if (amount != 0) {
            Balance = Balance + amount;
        }

    }

    @Override
    public double Withdraw(double amount) {
        if (amount > creditlimit) {
        Balance = Balance - creditlimit;
        return Balance;
        }
        Balance = Balance - amount;
        return amount;
    }

    @Override
    public double GetCurrentBalance() {
        return Balance;
    }

    @Override
    public int GetAccountNumber() {
        return accountnumber;
    }
}
