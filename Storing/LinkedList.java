package Storing;
// Node class represents a single node in the linked list
class Node {
    int data;     // Data stored in the node
    Node next;    // Reference to the next node

    // Constructor to initialize node data
    Node(int data) {
        this.data = data;
    }
}

// LinkedList class manages the singly linked list using head and tail
public class LinkedList {
    Node head; 
    Node tail;

    // Insert a new node at the beginning of the list
    public void insertAtBeginning(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
        // If the list was empty, set tail to the new node
        if (tail == null) {
            tail = temp;
        }
    }

    // Insert a new node at the end of the list
    public void insertAtEnd(int data) {
        Node temp = new Node(data);

        // If the list is empty, initialize head and tail
        if (head == null) {
            head = tail = temp;
            return;
        }

        // Append new node and update tail
        tail.next = temp;
        tail = temp;
    }

    // Insert a new node at a specific index (0-based)
    public void insertAtPosition(int index, int data) {
        int listSize = size();

        if (index < 0 || index > listSize) {
            System.out.println("Invalid index: " + index);
            return;
        }

        if (index == 0) {
            insertAtBeginning(data);
            return;
        }

        if (index == listSize) {
            insertAtEnd(data);
            return;
        }

        Node temp = new Node(data);
        Node current = head;

        // Traverse to node just before desired position
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        // Insert the new node
        temp.next = current.next;
        current.next = temp;
    }

    // Delete the first node with the given value
    public void deleteByValue(int data) {
        if (head == null) return;

        // If head node contains the value
        if (head.data == data) {
            head = head.next;
            if (head == null) tail = null;
            return;
        }

        Node temp = head;

        // Traverse to the node before the one to be deleted
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Value not found: " + data);
            return;
        }

        // Update tail if needed
        if (temp.next == tail) {
            tail = temp;
        }

        // Remove the node
        temp.next = temp.next.next;
    }

    // Delete a node at a specific index (0-based)
    public void deleteAtPosition(int index) {
        if (index < 0 || head == null) {
            System.out.println("Invalid index or empty list");
            return;
        }

        // Delete head node
        if (index == 0) {
            head = head.next;
            if (head == null) tail = null;
            return;
        }

        Node temp = head;

        // Traverse to the node just before the one to delete
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Index out of bounds");
            return;
        }

        // Update tail if needed
        if (temp.next == tail) {
            tail = temp;
        }

        // Remove the node
        temp.next = temp.next.next;
    }

    // Search for a value in the list
    public boolean search(int data) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == data) return true;
            temp = temp.next;
        }

        return false;
    }

    // Display all elements in the list
    public void display() {
        Node temp = head;

        if (temp == null) {
            System.out.println("List is empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Return the number of nodes in the list
    public int size() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    // Reverse the list in-place
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next;

        tail = head;  // Old head becomes new tail

        while (current != null) {
            next = current.next;   // Save next node
            current.next = prev;   // Reverse pointer
            prev = current;        // Move prev forward
            current = next;        // Move current forward
        }

        head = prev;  // Set new head
    }

    // Clear the list
    public void clear() {
        head = tail = null;
    }

    // Main method to test linked list operations
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtEnd(10);
        ll.insertAtBeginning(5);
        ll.insertAtEnd(15);
        ll.insertAtPosition(1, 8);
        ll.display();  // 5 -> 8 -> 10 -> 15 -> null

        ll.deleteByValue(8);
        ll.display();  // 5 -> 10 -> 15 -> null

        ll.deleteAtPosition(1);
        ll.display();  // 5 -> 15 -> null

        System.out.println("Search 15: " + ll.search(15)); // true
        System.out.println("Size: " + ll.size());          // 2

        ll.reverse();
        ll.display();  // 15 -> 5 -> null

        ll.clear();
        ll.display();  // List is empty
    }
}
