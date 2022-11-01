public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.createCDLL(1);
        cdll.insertNode(7,0);
        cdll.insertNode(5,1);
        cdll.insertNode(3,2);
        cdll.insertNode(8,3);
        System.out.println("traverse:");
        cdll.traverse();
        System.out.println("reverse Traverse:");
        cdll.reverseTraverse();
    }
}