public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList(); // new object
        dll.createDLL(1);
        dll.insertDLL(1,0);
        dll.insertDLL(2,1);
        dll.insertDLL(3,8);
//        System.out.println(dll.head.value); // 1
//        System.out.println(dll.head.next.value); // 2
//        System.out.println(dll.head.next.next.next.value);
//        System.out.println(dll.tail.value); // 3
//        System.out.println(dll.head.value);
        dll.traverse();
        dll.reverseTraverse();
    }
}