package com.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Express Banking System ===");
            System.out.println("1. Add Account");
            System.out.println("2. Transfer Amount");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    int accountNumber = scanner.nextInt();
                    System.out.print("Enter initial balance: ");
                    double balance = scanner.nextDouble();
                    bank.addAccount(accountNumber, balance);
                    break;
                case 2:
                    System.out.print("Enter sender account number: ");
                    int fromAccount = scanner.nextInt();
                    System.out.print("Enter receiver account number: ");
                    int toAccount = scanner.nextInt();
                    System.out.print("Enter amount to transfer: ");
                    double amount = scanner.nextDouble();
                    bank.transferAmount(fromAccount, toAccount, amount);
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    int accNum = scanner.nextInt();
                    bank.checkBalance(accNum);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
