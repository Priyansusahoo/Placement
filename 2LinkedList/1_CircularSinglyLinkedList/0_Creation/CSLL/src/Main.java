public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList cSLL = new CircularSinglyLinkedList();
        cSLL.createCSLL(5);
        System.out.println(cSLL.head.value);
        System.out.println(cSLL.head.next.value);
        /**
         * Time-Complexity: O(1)
         * Space-Comlpexity: O(1)
         */
    }
}