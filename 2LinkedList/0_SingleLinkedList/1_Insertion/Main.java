/**
 * Main
 */
class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
//        System.out.println(sLL.head.value);

        sLL.insertionInLinkedList(6, 1);
        System.out.println(sLL.head.value);
        System.out.println(sLL.head.next.value);
    }
}