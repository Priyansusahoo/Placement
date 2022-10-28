public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    /**
     * creation
     */
    public Node createCSLL(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    /**
     * insertion
     */
    public void insertCSLL(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if (head == null){ // LL exist or not -----------------------------> O(1)
            createCSLL(nodeValue);
            return;
        } else if (location == 0) { // at beginning ------------------------> O(1)
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location >= size) { // at last ---------------------------> O(1)
            tail.next = node;
            tail = node;
            tail.next = head;
        } else { // at mentioned location
            Node tempNode = head;
            int index = 0;
            while(index < location - 1){ //refer to lecture 101 ---------------> O(N)
                tempNode = tempNode.next;
                index ++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size ++;
        /**
         * Time-Complexity: O(N)
         * Space-Complexity: O(1)
         */
    }
    /**
     * traversal
     */
    public void traverseCSLL(){
        System.out.println();
        if (head != null){ // -----------------------------------> O(1)
            Node tempNode = head;
            for (int i = 0; i < size; i++) { // -----------------> O(N)
                System.out.print(tempNode.value);
                if (i != size - 1){ // --------------------------> O(1)
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next; // --------------------> O(1)
            }
            System.out.println();
        } else {
            System.out.println("\nCSLL does not exist"); // -----> O(1)
        }
        /**
         * Time-Complexity: O(N)
         * Space-Complexity: O(1)
         */
    }
    /**
     * searching
     */
    public boolean searchingNode(int nodeValue){
        if (head != null){
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue){
                    System.out.println("node found at location " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;

    }
}
