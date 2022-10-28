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
}
