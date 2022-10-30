public class DoublyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    /**
     * create DLL
     */
    public DoublyNode createDLL(int nodeValue){
        System.out.println();
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.prev = null;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
        /**
         * Time-Complexity: O(1)
         * Space-Complexity: O(1)
         */
    }
}