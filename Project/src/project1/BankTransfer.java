package project1;

import java.util.Scanner;

public class BankTransfer {

    private String fromAcc;
    private String toAcc;
    private double amount;
    private String branch;
    private double fromAccBalance = 10000;

    public void checkBalance() {
        System.out.println("Current balance in account " + fromAcc + ": " + fromAccBalance);
    }

    public void fundTransfer() {
        if (fromAccBalance >= amount) {
            fromAccBalance -= amount;
            System.out.println(amount + " Transaction successful");
        } else {
            System.out.println("Insufficient funds or invalid amount for transfer");
        }
    }

    public static void main(String[] args) {
        BankTransfer transaction = new BankTransfer();
        transaction.fromAcc = "12345";
        transaction.toAcc = "67890";
        transaction.branch = "SBI Avaniyapuram Main Branch";

        Scanner scanner = new Scanner(System.in);

        System.out.println(transaction.fromAcc);
        System.out.println(transaction.toAcc);
        System.out.println(transaction.branch);
        System.out.println("1. Check Balance");
        System.out.println("2. Fund Transfer");
        System.out.println("0. Exit");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

    switch (choice) {
            case 1:
            	System.out.print("Enter amount to transfer: ");
                transaction.amount = scanner.nextDouble();
                transaction.fundTransfer();
              
            case 2:
            	  transaction.checkBalance();
            	  break;
               
                 default:
                System.out.println("Invalid choice");
                break;
        }

    }
}
