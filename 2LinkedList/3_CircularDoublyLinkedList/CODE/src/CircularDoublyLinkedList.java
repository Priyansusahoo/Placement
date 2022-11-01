public class CircularDoublyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    //create1stNode
    public DoublyNode createCDLL(int nodeValue){ // O(1)
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        head = newNode;
        tail = newNode;
        newNode.prev = newNode;
        newNode.next = newNode;
        size = 1;
        return head;
        /**
         * Time-Complexity: O(1)
         * Space-Complexity: O(1)
         */
    }
}