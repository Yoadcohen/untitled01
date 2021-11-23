package com.company;

public class PremiumAccount extends StandardAccount {

    public PremiumAccount(int accountNumber, double creditLimit) {
        super(accountNumber,0);
    }

    @Override
    public double Withdraw(double amount) {
        this.Balance -= amount;
        return amount;
    }
}