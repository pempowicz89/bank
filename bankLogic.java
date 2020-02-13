package com.company;

import java.util.ArrayList;

public class bankLogic {
    private String name;
    private long pNr;
    private ArrayList<customer> customerlist;

    savingAccount account = new savingAccount();

    public bankLogic()
    {
        customerlist = new ArrayList<customer>();
    }

    //----------------------------------------------------------------------
    // Beskrivning: returnerar presentation av alla kunder(pers.nr och namn)
    // Returvärde: String
    //----------------------------------------------------------------------
    public String infoBank()
    {
        String customers = customerlist.toString();
        return customers.substring(1, customers.length() - 1);
    }

    //----------------------------------------------------------------------
    // Beskrivning: lägger till ny kund om personnumret pNr inte redan finns
    // Inparametrar: String name, long pNr - namn och personnummer kontrolleras
    // Returvärde: boolean - add om namnet sparas, false om personnumret
    // redan finns
    //----------------------------------------------------------------------
    public boolean addCustomer(String name, String pNr)
    {
        boolean add = true;
        for(int i = 0; i < customerlist.size(); i++)
        {
            if (customerlist.get(i).getPNr() == pNr)
            {
                add = false;
            }
        }

        if(add)
        {
            customerlist.add(new customer(name, pNr));
            add = true;
        }

        return add;
    }

    //----------------------------------------------------------------------
    // Beskrivning: returnera info om vald kund
    // Inparametrar: long pNr - personnummer kontrolleras
    // Returvärde: String - returnerar personnummer, namn och ev. konton
    //----------------------------------------------------------------------
    public String infoCustomer(String pNr)
    {
        String info = "";
        for(int i = 0; i < customerlist.size(); i++)
        {
            if (customerlist.get(i).getPNr() == pNr)
            {
                customer customer = customerlist.get(i);
                customer.toString();
            }
        }
        return info;
    }

    //----------------------------------------------------------------------
    // Beskrivning: byter namn på kund
    // Inparametrar: String name, long pNr - nytt namn med personnummer sparas
    // Returvärde: boolean - true om namnet ändrades, false om det inte ändrades
    //----------------------------------------------------------------------
    public boolean changeCustomerName(String name, String pNr){

        boolean result = false;
        for(int i = 0; i < customerlist.size(); i++)
        {
            if (customerlist.get(i).getPNr() == pNr)
            {
                customer customer = customerlist.get(i);
                customer.setName(name);
                customerlist.set(i, customer);
                result = true;
            }
        }return result;
    }
    //----------------------------------------------------------------------
    // Beskrivning: tar bort kund och dess konton och returnerar info om
    // vilka konton som tagits bort, kvarvarande saldo och ränta
    // Inparametrar: long pNr - personnummer kontrolleras
    // Returvärde: String - info om raderade konton och kvarvarande saldo
    //----------------------------------------------------------------------
    public String removeCustomer(long pNr)
    {

    }
    //----------------------------------------------------------------------
    // Beskrivning: skapar ett konto till kund utifrån pers.nr
    // Inparametrar: long pNr - personnummer kontrolleras
    // Returvärde: int - returnerar kontonummer, alternativt returneras -1
    // om inget konto skapades
    //----------------------------------------------------------------------
    public int addSavingsAccount(long pNr){

        for(int i = 0; i < customerlist.size(); i++)
        {
            if (customerlist.get(i).getPNr() == d)
            {
                customer customer = customerlist.get(i);
                customer.addAccount(pNr);
                return savingAccount. pNr;
            }
            }

    //----------------------------------------------------------------------
    // Beskrivning: returnerar info om konto med kontonummer accountId som
    // tillhör kunden pNr
    // Inparametrar: long pNr, int accountId - personnummer och kontonummer
    // kontrolleras
    // Returvärde: String - returnerar kontonummer,saldo, kontotyp och räntesats
    //----------------------------------------------------------------------
    public String infoAccount(String "pN, int accountId){

        }

        if(customerlist.size() == 0)
        {
            System.err.println("Kontot hittades inte.");
        }
        else
        {
            boolean found = false; //ingen kund hittades
            for(int i = 0; i < customerlist.size(); i++)
            {
                accountId temp = customer.getAccount(); //går igenom alla kunder
                int accTemp = account.getAccountId(); //hämtar kundens kontonummer
                if(accTemp == accountId); //jämför kontonumret med det angivna
                {
                    System.out.println("Saldo på kontot: " + temp.balance()); //hämtar saldo
                    found = true; //kund och konto hittades
                }
            }
            if(found == false)
            {
                System.err.println("Kontot hittades inte.");
            }
        }
    }
    //----------------------------------------------------------------------
    // Beskrivning: gör en insättning på kontonummer med accountId som
    // tillhör kunden med personnummer pNr
    // Inparametrar: long pNr, int accountId, double amount
    // Returvärde: true om insättningen lyckades annars false
    //----------------------------------------------------------------------
    public boolean deposit(long pNr, int accountId, double amount)
    {
        //account.deposit(amount);


        if(customerlist.size() == 0)
        {
            System.out.println("Kontot hittades inte");
        }
        else
        {
            boolean found = false; //ingen kund hittades
            for(int i = 0; i < customerlist.size(); i++)//går igenom alla kunder
            {
                account temp = customer.getAccount(); //hämtar kontot
                int accTemp = account.getAccountId(); //hämtar kundens kontonummer
                //System.out.println(accTemp);
                if(accTemp == accountId); //jämför kontonumret med det angivna
                {
                    temp.deposit(amount); //sätter in pengarna
                    found = true; //kund och konto hittades
                }
            }
            if(found == false)
            {
                System.err.println("Kontot hittades inte");
            }
        }return true;
    }

    //----------------------------------------------------------------------
    // Beskrivning: gör ett uttag på kontonummer med accountId som
    // tillhör kunden pNr
    // Inparametrar: long pNr, int accountId, double amount
    // Returvärde: true om insättningen lyckades annars false
    //----------------------------------------------------------------------
    public boolean withdraw()
    {
        if(customerlist.size() == 0)
        {
            System.out.println("Kontot hittades inte");
        }
        else
        {
            boolean found = false; //ingen kund hittades
            for(int i = 0; i < customerlist.size(); i++)//går igenom alla kunder
            {
                account temp = customer.getAccount(); //hämtar kontot
                int accTemp = account.getAccountId(); //hämtar kundens kontonummer
                //System.out.println(accTemp);
                int accountId;
                if(accTemp == accountId); //jämför kontonumret med det angivna
                {
                    temp.(withdraw()amount); //tar ut pengarna
                    found = true; //kund och konto hittades
                }
            }
            if(found == false)
            {
                System.err.println("Kontot hittades inte");
            }
        }return true;
    }

    //----------------------------------------------------------------------
    // Beskrivning: stänger konto accountId
    // Inparametrar: long pNr, int accountId - personnummer och
    // kontonummer kontrolleras
    // Returvärde: String - returnerar saldo och ränta
    //----------------------------------------------------------------------
    public void closeAccount(String pNr, int accountId)
    {
        boolean kund = customerlist.contains(account);
        for(int i = 0; i < customerlist.size(); i++)
        {
            if (customerlist.get(i).getPNr() == pNr)
            {

                customer customer = customerlist.get(i);
                customerlist.remove(i);
            }
        }return;

    }


}

