/**
 * SinglyLinkedList
 */
public class
SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    /**
     * creation()
     */
    public Node createSinglyLinkedList(int nodeValue) { // -------------> O(1)
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
        /**
         * Time-Complexity: O(1)
         */
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
             while(index < location - 1){ // O(N)
                 tempNode = tempNode.next;
                 index++;
             }
             Node nextNode = tempNode.next; // O(1)
             tempNode.next = node; // O(1)
             node.next = nextNode; // O(1)
        }
        size++; // O(1)
        /**
         * Time-Complexity: O(N)
         * Space-Complexity: O(1) // cause when ever we call insertion method
         * we will only insert one node that is why SC->O(1).
         */
    }

    /**
     * Traverse
     */
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
    /**
     * Searching
     */
    public boolean searchNode(int nodeValue){
        if (head != null){ // O(1)
            Node tempNode = head;
            for (int i = 0; i < size; i++) { // O(N)
                if (tempNode.value == nodeValue){ // O(1)
                    System.out.println("Found the node in location " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next; // O(1)
            }
        }
        System.out.println("Node not found"); // O(1)
        return false;
        /**
         * Time-Compleixty: O(N)
         * Space-Complexity: O(1)
         */
    }
    /**
     * Deletion of Node
     */
    public void deletionOfNode(int location){
        if (head == null){
            System.out.println("SLL doesn't exist");
            return;
        } else if (location == 0) { // at beginning // -----------------------> O(1)
            head = head.next;
            size --;
            if (size == 0){ // ------------------------------------------------>O(1)
                tail = null;
            }
        } else if (location >= size) { // at end
            Node tempNode = head; // -----------------------------------------> O(1)
            for (int i = 0; i < size - 1; i++) { // --------------------------> O(N)
                tempNode = tempNode.next;
            }
            if (tempNode == head){ //if SLL of one Node // -------------------> O(1)
                tail = head = null;
                size --;
                return;
            }
            tempNode.next = null; // if SLL of 'n' Nodes // for next 3 lines -----------> O(1)
            tail = tempNode;
            size --;
        } else { // at mentioned location
            Node tempNode = head; // ---------------------------------------------> O(1)
            for (int i = 0; i < location - 1; i++) { // ------------------------------> O(N)
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next; // for next 2 lines --------------> O(1)
            size --;
        }
        /**
         * Time-Complexity: O(N)
         * Space-Complexity: O(1)
         */
    }
    //delete Singly Linked List
    public void deleteSLL(){ // ----------------->O(1)
        head = null;
        tail = null;
        System.out.println("linked list deleted successfully");
        /**
         * TC: O(1)
         */
    }
}

