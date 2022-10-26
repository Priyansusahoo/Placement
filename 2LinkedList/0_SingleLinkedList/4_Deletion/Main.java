/**
 * Main
 */
class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
//        System.out.println(sLL.head.value);

        //insertion
        sLL.insertionInLinkedList(6, 1);
        sLL.insertionInLinkedList(0, 2);
        sLL.insertionInLinkedList(9, 3);
        sLL.insertionInLinkedList(3, 4);
        sLL.insertionInLinkedList(7, 5);
        sLL.insertionInLinkedList(5, 6);
//        System.out.println(sLL.head.value);
//        System.out.println(sLL.head.next.value);
        //traverse
        sLL.traverseSinglyLinkedList();
        //searching
//        sLL.searchNode(7);
//        sLL.searchNode(10);
        //deletion
        sLL.deletionOfNode(3);
        sLL.traverseSinglyLinkedList();
    }
}