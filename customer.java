package com.company;

public class customer {

        public String name;
        public String pNr;
        public static savingAccount savingAccount;

        customer(String n, String p)
        {
            name = n;
            pNr = p;
        }
/*	Customer(String n, long p, Account a)
	{
		name = n;
		pNr = p;
		account = a;
	}
*/

        public String getName()
        {
            return name;
        }

        public String setName(String newName)
        {
            return name = newName;
        }

        public String getPNr()
        {
            return pNr;
        }

        public static savingAccount getAccount()
        {
            return savingAccount;
        }

        public savingAccount clearAccount()
        {
            return savingAccount = null;
        }

        public void clearCustomer()
        {
            name = null;
            pNr = null;
        }

        public String display(long pNr)
        {
            return "Namn: " + name + "\tPersonnummer: " + pNr;
        }

        public String toString(){
            return "\nPersonnummer: " + pNr + "\tNamn: " + name +
                    "\tKontonummer: " + savingAccount.toString();
        }

        public savingAccount addAccount(long owningCustomer) {
            savingAccount acc = new savingAccount();
            return acc;
        }

    }

