package com.company;

class SavingsAccount {
    public int currentbalance;
    public String accountNumber;
    public double intrestRate;
    public String savingAccount;
    public int lastAssignedNumber = 1000;


    public SavingsAccount(int currentbalance, String accountNumber, int intrestRate, String savingAccount) {
        this.currentbalance = currentbalance;
        this.accountNumber = accountNumber;
        this.intrestRate = intrestRate;
        this.savingAccount = savingAccount;
    }

    public int getCurrentbalance() {
        return currentbalance;
    }

    public void setCurrentbalance(int currentbalance) {
        this.currentbalance = currentbalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getIntrestRate() {
        return intrestRate;
    }

    public void setIntrestRate(int intrestRate) {
        this.intrestRate = intrestRate;
    }

    public String getSavingAccount() {
        return savingAccount;
    }

    public void setSavingAccount(String savingAccount) {
        this.savingAccount = savingAccount;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "currentbalance=" + currentbalance +
                ", accountNumber='" + accountNumber + '\'' +
                ", intrestRate=" + intrestRate +
                ", savingAccount='" + savingAccount + '\'' +
                '}';
    }
}
