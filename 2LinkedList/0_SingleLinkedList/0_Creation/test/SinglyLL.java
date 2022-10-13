package test;

public class SinglyLL {
    public Node head;
    public Node tail;
    public int size;

    // create Method
    public Node createSinglyLL(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.nextReference = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

}
