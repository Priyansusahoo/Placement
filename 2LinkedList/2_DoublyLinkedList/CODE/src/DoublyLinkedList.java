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
    /**
     * insertion DLL
     */
    public void insertDLL(int nodeValue, int location){
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if (head == null){ // check if DLL exist or not (if not create on by taking nodeValue)
            createDLL(nodeValue); // --------------------------------------------> O(1)
            return;
        } else if (location == 0) { // location at first // ---------------------> O(1)
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
        } else if (location >= size) { // at last // -----------------------------> O(1)
            newNode.next = null;
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else { // at mentioned location
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location - 1){ // --------------------------------------> O(N)
                tempNode = tempNode.next;
                index ++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size ++;
        /**
         * Time-Complexity: O(N)
         * Space-Complexity: O(1)
         */
    }
}