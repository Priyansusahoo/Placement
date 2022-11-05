/**
 * LinkedList
 */
public class LinkedList {
    public Node head;
    public Node tail;
    public int size;
    //createLL
    void createLL(int nodeValue){
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        head = newNode;
        tail = newNode;
        size = 1;
    }
    //insertNode
    void insertNode(int nodeValue){
        Node newNode = new Node();
        newNode.next = null;
        newNode.value = nodeValue;
        tail.next = newNode;
        tail = newNode;
        size ++;
    }
    //traverse
    void traverseLL(){
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.value);
            if (i != size - 1) System.out.print(" -> ");
            tempNode = tempNode.next;
        }
    }
}
