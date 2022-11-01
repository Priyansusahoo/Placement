public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList(); // new object
        dll.createDLL(1);
        dll.insertDLL(1,0);
        dll.insertDLL(2,1);
        dll.insertDLL(3,8);

        System.out.println("Traverse DLL:");
        dll.traverse();
        System.out.println("ReverseTraverse DLL:");
        dll.reverseTraverse();
        System.out.println("Searching Node in DLL:");
        dll.searchNode(3);
        dll.searchNode(9);
        System.out.println("traverse before deleting node:");
        dll.traverse();
        dll.deleteNode(2);
        System.out.println("traverse after deleting node:");
        dll.traverse();
        System.out.println("Deleting entire DLL");
        dll.deleteDLL();
        System.out.println("After deleting DLL-> traverse");
        dll.traverse();
    }
}