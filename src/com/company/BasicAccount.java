package com.company;

public class BasicAccount extends StandardAccount{

    private double WithdrawalLimit;

    public BasicAccount(int accountNumber, double creditLimit, double withdrawalLimit)
    {
        super(accountNumber, creditLimit);
        this.WithdrawalLimit = withdrawalLimit;
    }
    @Override
    public double Withdraw(double amount) {
        if(this.Balance>amount) {
            if ((amount) > (this.WithdrawalLimit)) {
                this.Balance -= this.WithdrawalLimit;
                return this.WithdrawalLimit;
            }
            this.Balance -= amount;
            return amount;
        }
        double X = this.Balance;
        this.Balance=0;
        return X;
    }
}