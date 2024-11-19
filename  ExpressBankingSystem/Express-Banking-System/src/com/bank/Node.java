package com.bank;

public class Node {
    int accountNumber;
    double balance;
    Node next;

    public Node(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.next = null;
    }
}
