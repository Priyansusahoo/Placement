package interview_questions;

public class LinkedList {
    public Node head;

    public Node tail;

    public int size;

    // create linked list
    public void create(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.prev = null; // me
        head = newNode;
        tail = newNode;
        size = 1;
    }

    // insert in LinkedList
    public void insert(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.prev = tail; // me
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void traverse() {
        Node currentNode = head;
        for (int i = 0; i < size; i++) {
            System.out.print(currentNode.value);
            if (i != size - 1) {
                System.out.print(" -> ");
            }
            currentNode = currentNode.next;
        }
        System.out.println("\n");
    }
}
