/**
 * SinglyLinkedList
 */
public class SinglyLinkedList {
    // SinglyLinkedList has a head, tail, size.
    public Node head;
    public Node tail;
    public int size;

    // Method to create SinglyLinkedList
    public Node createSinglyLinkedList(int nodeValue) {
        head = new Node(); // create a new head // O(1)
        Node node = new Node(); // create a new node // O(1)
        node.nextReference = null; // O(1) // initilize nextReference for node ti null
        node.value = nodeValue; // O(1) // value from Node = nodeValue from input
        head = node; // O(1) // initialy head -> node
        tail = node; // O(1) // initialy tail -> node
        size = 1; // O(1) // initialy size = 1
        return head;// NOTE -(8)
    }
}
/**
 * NOTE -
 * (8) - Returned head because to identify a singlyLL it, we need
 * to start from head, then traverse one-by-one.
 * 
 * - Creating a singlyLL takes O(1) Time-Complexity
 * Space-Complexity : O(1) - because only one node is created.
 */