/**
 * SinglyLinkedList
 */
public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    /**
     * creation()
     */
    public Node createSinglyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    /**
     * insertion()
     */
    public void insertionInLinkedList(int nodeValue, int location){
        Node node = new Node(); //O(1)
        node.value = nodeValue; //O(1)

        if (head == null){ // create if LL is empty // O(1)
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) { // At beginning // O(1)
            node.next = head;
            head = node;
        } else if (location >= size) { // At end // O(1)
            node.next = null;
            tail.next = node;
            tail = node;
            // if having doubts in else statement refer to  Section11-L90.
        } else { // at mentioned location
             Node tempNode = head; // O(1)
             int index = 0; // O(1)
             while(index < location - 1){ // O(n)
                 tempNode = tempNode.next;
                 index++;
             }
             Node nextNode = tempNode.next; // O(1)
             tempNode.next = node; // O(1)
             node.next = nextNode; // O(1)
        }
        size++; // O(1)
        /**
         * Time-Complexity: O(n)
         * Space-Complexity: O(1) // cause when ever we call insertion method
         * we will only insert one node that is why SC->O(1).
         */
    }
    public void traverseSinglyLinkedList(){
        if(head == null){ // O(1)
            System.out.println("SLL doesn't exists");
        } else{
            Node tempNode = head; // O(1)
            for (int i = 0; i < size; i++) { // O(N)
                System.out.print(tempNode.value); // O(1)
                if (i != size - 1){ //O(1)
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next; // O(1)
            }
        }
        System.out.println("\n"); // O(1)
        /**
         * Time-Complexity: O(N)
         * Space-Complexity: O(1)
         */
    }
}

