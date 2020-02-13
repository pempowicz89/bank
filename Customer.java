package com.company;

public class Customer {
    public String firstName;
    public String lastName;
    public String pNr;
    public String customerAccount;


    public Customer(String firstName, String lastName, String pNr, String customerAccount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pNr = pNr;
        this.customerAccount = customerAccount;
    }

    public Customer(String userName, String password, boolean b, String firstName, String lastName, String ssn, String address, String phoneNumber, int i) {
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getpNr() {
        return pNr;
    }

    public void setSSN(String pNr) {
        this.pNr = pNr;
    }

    public String getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(String customerAccount) {
        this.customerAccount = customerAccount;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pNr='" + pNr + '\'' +
                ", customerAccount='" + customerAccount + '\'' +
                '}';
    }
}

