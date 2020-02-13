package com.company;

public class savingAccount extends bankLogic {
    public static int pNr;
    private int AccountId;

    public int getAccountId() {
        return getAccountId();
    }

    public void setAccountId(int accountId) {
        this.AccountId = accountId;
    }

    public static class Account {
        private double balance = 0;
        public int accountId = 1000;
        private String accounttype = "Sparkonto";
        private double transactionFees = 0;
        public static final double RATE = 1.0;
        private boolean firsttime = true;
        public int deposit;
        public int withdraw;


        public Account()
        {
            accountId++;
        }
        public Account(double bal)
        {
            if (bal >= 0)
            {
                balance = bal;
            }
            else
            {
                balance = 0;
            }
            accountId++;
        }

        public int getAccountId()
        {
            return accountId;
        }

        public String getAccountType(){
            return accounttype;
        }

        public void deposit(double amount)
        {
            if(amount > 0)
            {
                balance += amount;
                System.out.println(amount + " har satts in på ditt konto. Nytt saldo är " + balance);
            }
            else
            {
                System.err.println("Kontrollera att beloppet inte är negativt.");
            }
        }

        public void withdraw(double amount)
        {
            if(amount > 0)
            {
                if(firsttime==true)//villkor för första uttaget
                {
                    double tempBalance = balance; //saldot sparas i en tillfällig variabel
                    tempBalance -= amount; //för jämförelse av
                    if(tempBalance >= 0)//bankens krav på minimumbelopp på kontot
                    {
                        balance -= amount;
                    }
                    else
                    {
                        System.err.println("Uttag på " + amount + " kr medges inte. Uttaget för stort.");
                    }
                    firsttime = false;
                }
                else
                {
                    double tempBalance = balance;//saldot sparas i tillfällig variabel för jämförelse
                    tempBalance = tempBalance - amount - getTransactionFees();//+ avdrag för bankens avgifter
                    if(tempBalance >= 0)//bankens krav på minimumbelopp på kontot
                    {
                        balance -= amount - getTransactionFees();
                    }
                }
            }
            else
            {
                System.err.println("Kontrollera att beloppet inte är negativt.");
            }
        }

        public double getBalance()
        {
            return balance;
        }

        public void calculateIntRate(customer customer){
            savingAccount a = customer.getAccount();//hämtar kontot för kunden
            double bal = balance;
            double interestAmount = bal * RATE / 100;
            double totalBalance = bal + interestAmount;
            System.out.println("Ränta: " + interestAmount + "Belopp på kontot inkl. ränta: " + totalBalance);
        }

        public double getInterestRate()
        {
            return RATE;
        }

        public double getTransactionFees()
        {
            return transactionFees;
        }

        public void display()
        {
            System.out.println("Kontonr: " + accountId + "\tSaldo: " + balance
                    + "\tKontotyp: " + accounttype + "\tRänta: " + RATE);
        }

    }
}
