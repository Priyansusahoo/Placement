/**
 * Main
 */
class Main {
	public static void main(String[] args) {
		SinglyLinkedList sLL = new SinglyLinkedList();
		sLL.createSinglyLinkedList(5);
		System.out.println(sLL.head.value);
	}
}
