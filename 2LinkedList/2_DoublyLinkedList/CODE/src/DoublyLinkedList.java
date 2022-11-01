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
    /**
     * traverse
     */
    public void traverse(){
        if (head != null){ // ------------------> O(1)
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) { // ---------------> O(N)
                System.out.print(tempNode.value);
                if (i != size - 1){ // -----------------------> O(1)
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next; //O(1)
            }
        } else { // ----------------------> O(1)
            System.out.println("DLL doesn't exist");
        }
        System.out.println("\n");
        /**
         * Time-Complexity: O(N)
         * Space-Complexity: O(1)
         */
    }
    /**
     * reverse-traverse
     */
    public void reverseTraverse(){
        if (head != null){
            DoublyNode tempNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1){
                    System.out.print(" <- ");
                }
                tempNode = tempNode.prev;
            }
        } else {
            System.out.println("DLL doesn't exist");
        }
        System.out.println("\n");
        /**
         * Time-Complexity: O(N)
         * Space-Complexity: O(1)
         */
    }
    /**
     * searchNode
     */
    public boolean searchNode(int nodeValue){
        if (head != null){ // ---------------> O(1)
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) { // -----------------> O(N)
                if (tempNode.value == nodeValue){ // ------------> O(1)
                    System.out.println("Node with value "+ nodeValue +" found at " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
            System.out.println();
        }
        System.out.println("Node with value "+ nodeValue +" not found\n");
        return false;
        /**
         * Time-Complexity: O(N)
         * Space-Complexity: O(1)
         */
    }
    /**
     * deleteNode
     */
    public void deleteNode(int location){
        if (head == null){ // check if DLL exist or not
            System.out.println("DLL doesn't exist");
            return;
        } else if (location == 0) { // at first
            if (size == 1){ // case-1 if DLL consist of one node
                head = null;
                tail = null;
                size --;
                return;
            } else { // case-2 if DLL consist of multiple node
                head = head.next;
                head.prev = null;
                size --;
            }
        } else if (location >= 0) { // at last
            DoublyNode tempNode = tail.prev;
            if (size == 1){ // case-1 if DLL consist of one node
                head = null;
                tail = null;
                size --;
                return;
            } else { // case-2 if DLL consist of multiple nodes
                tempNode.next = null;
                tail = tempNode;
                size --;
            }
        } else { // at mentioned location
            DoublyNode tempNode = head;
            for (int i = 0; i < location - 1; i++) { // loop to find "location - 1"
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size --;
        }
    }
}