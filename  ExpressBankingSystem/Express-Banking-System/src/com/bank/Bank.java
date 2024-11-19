package com.bank;

public class Bank {
    private LinkedList accountsList;

    public Bank() {
        accountsList = new LinkedList();
    }

    // Add a new account
    public void addAccount(int accountNumber, double balance) {
        if (accountsList.findNode(accountNumber) != null) {
            System.out.println("Account " + accountNumber + " already exists.");
            return;
        }
        accountsList.addNode(accountNumber, balance);
        System.out.println("Account " + accountNumber + " added successfully.");
    }

    // Transfer money between accounts
    public void transferAmount(int fromAccount, int toAccount, double amount) {
        Node sender = accountsList.findNode(fromAccount);
        Node receiver = accountsList.findNode(toAccount);

        if (sender == null) {
            System.out.println("Sender account " + fromAccount + " does not exist.");
            return;
        }
        if (receiver == null) {
            System.out.println("Receiver account " + toAccount + " does not exist.");
            return;
        }
        if (sender.balance < amount) {
            System.out.println("Insufficient balance in account " + fromAccount + ".");
            return;
        }

        sender.balance -= amount;
        receiver.balance += amount;
        System.out.println("Transferred $" + amount + " from " + fromAccount + " to " + toAccount + ".");
    }

    // Check account balance
    public void checkBalance(int accountNumber) {
        Node account = accountsList.findNode(accountNumber);
        if (account != null) {
            System.out.println("Account " + accountNumber + " balance: $" + account.balance);
        } else {
            System.out.println("Account " + accountNumber + " does not exist.");
        }
    }
}
