public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void createLL(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        head = newNode;
        tail = newNode;
        size = 1;
    }

    public void insertNode(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void traversalLL() {
        Node tempNode = head;
        for (int i =0; i<size; i++) {
            System.out.print(tempNode.value);
            if (i != size -1) {
                System.out.print(" -> ");
            }
            tempNode = tempNode.next;
        }
    }

}