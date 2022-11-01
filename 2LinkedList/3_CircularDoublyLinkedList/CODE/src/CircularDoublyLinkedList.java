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
    /**
     * insertNode
     */
    public void insertNode(int nodeValue, int location){
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if (head == null){ // O(1)
            createCDLL(nodeValue);
            return;
        } else if (location == 0) { // O(1)
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        } else if (location >= size) { // O(1)
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            tail = newNode;
        } else {
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location - 1){ // -----------> O(N)
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
    /**
     * traverse
     */
    public void traverse(){
        System.out.println();
        if(head != null){
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) { // -------> O(N)
                System.out.print(tempNode.value);
                if (i != size - 1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        } else {
            System.out.println("CDLL doesn't exist");
        }
        System.out.println();
        /**
         * Time-Complexity: O(N)
         * Space-Complexity: O(1)
         */
    }
    /**
     * reverseTraverse
     */
    public void reverseTraverse(){
        if (head != null){
            DoublyNode tempNode = tail;
            for (int i = 0; i < size; i++) { // -------> O(N)
                System.out.print(tempNode.value);
                if (i != size - 1){
                    System.out.print(" <- ");
                }
                tempNode = tempNode.prev;
            }
        } else {
            System.out.println("CDLL doesn't exist");
        }
        /**
         * Time-Complexity: O(N)
         * Space-Complexity: O(1)
         */
    }
    /**
     * search for Node
     */
    public boolean searchNode(int nodeValue){
        if (head != null){
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue){
                    System.out.println("Node with value "
                            + nodeValue
                            + " found at location "
                            + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("node with value "
                + nodeValue
                + " not found");
        return false;
    }
}