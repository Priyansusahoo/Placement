/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.createLL(1);
        ll.insertNode(2);
        ll.insertNode(3);
        ll.insertNode(4);
        ll.insertNode(5);
        ll.insertNode(6);
        ll.insertNode(7);
        ll.insertNode(8);
        ll.traverseLL();
        Question q = new Question();
        Node n = q.nthToLast(ll, 4);
        System.out.println(n.value);
    }
}