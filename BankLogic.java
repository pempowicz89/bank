package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class BankLogic {
    public static int lastAssignedNumber = 1000;
    Scanner input = new Scanner(System.in);
    BankLogic bankLogic = new BankLogic();
    boolean exit;
    private int IdCounter = 1000;


    public static void main(String[] args) {
        BankLogic menu = new BankLogic();
        menu.runMenu();
        Customer object;

        ArrayList<Customer> customerList = new ArrayList<Customer>();


    }

    public void runProgram() {
        int choice;

        /*Customer customer1 = new Customer("Kalle", "Karlsson", "890313-3333",
                "7623-233");
        Customer customer2 = new Customer("Peller", "Persson", "830910-3466",
                "8273-2302");
        Customer customer3 = new Customer("Lena", "Larsson", "780213-4590",
                "2890-3435");
        .add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);  */

    }

    public void runMenu() {

        printHeader();
        while (!exit) {
            printMenu();
            int choice = getInput();
            performAction(choice);

        }
    }

    private void printHeader() {
        System.out.println("---Welcome to my bank---");


    }

    private void printMenu() {
        System.out.println("1) View all customers");
        System.out.println("2) Add a new customer");
        System.out.println("3) Edit Customer     ");
        System.out.println("4) Remove customer   ");
        System.out.println("0) Exit              ");


    }

    private int getInput() {
        int choice = -1;
        do {
            System.out.print("Enter your choice: ");

            try {

                choice = Integer.parseInt(input.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Invalid selection, Numbers only please.");
            }
            if (choice < 0 || choice > 4) {
                System.out.println("choice outside out of range, Please choose again.");
            }
        } while (choice < 0 || choice > 4);
        return choice;

    }

    public void performAction(int choice) {
        switch (choice) {
            case 0:
                System.out.print("Thank your for using my application!");
                System.exit(0);
                break;
            case 1:
                //listOfCustomers;
                break;
            case 2:

                //createCustomer;

                break;
            case 3:
                //editCustomer;
                break;
            case 4:
                //removeCustomer;
                break;
            default:
                System.out.print("Unknown error has occurred...");


        }


    }

    public void listOfCustomer() {

    }

    public void createCustomer() {

    }


    public void editCustomer() {

    }

    public void removeCustomer() {

    }
}


































