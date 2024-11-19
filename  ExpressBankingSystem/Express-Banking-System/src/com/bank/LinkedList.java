package com.bank;

public class LinkedList {
    private Node head;

    // Add a new node
    public void addNode(int accountNumber, double balance) {
        Node newNode = new Node(accountNumber, balance);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Find a node by account number
    public Node findNode(int accountNumber) {
        Node current = head;
        while (current != null) {
            if (current.accountNumber == accountNumber) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
}
