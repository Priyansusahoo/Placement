public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.createNode(1);
        ll.insertNode(2);
        ll.insertNode(1);
        ll.insertNode(4);
        ll.insertNode(5);
        ll.traverseLL();
        Questions dn = new Questions();
        dn.deleteDups(ll);
        ll.traverseLL();
    }
}