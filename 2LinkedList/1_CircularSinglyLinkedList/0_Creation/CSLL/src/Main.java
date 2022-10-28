public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList cSLL = new CircularSinglyLinkedList();
        cSLL.createCSLL(5);
        cSLL.insertCSLL(4,0);
        cSLL.insertCSLL(3,1);
        cSLL.insertCSLL(7,8);
//        System.out.println(cSLL.head.value);
//        System.out.println(cSLL.head.next.next.value);
        //traverse
        cSLL.traverseCSLL();
        cSLL.searchingNode(7);
    }
}