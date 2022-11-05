package test;

public class LinkedList {
	public Node head;
	public Node tail;
	public int size;
	
	//creation
	public void createLL(int nodeValue) {
		Node newNode = new Node();
		newNode.next = null;
		newNode.value = nodeValue;
		head = newNode;
		tail = newNode;
		size = 1;
//		return head;
	}
	
	//insertNode
	public void insertNode(int nodeValue) {
		Node newNode = new Node();
		newNode.next = null;
		newNode.value = nodeValue;
		tail.next = newNode;
		tail = newNode;
		size ++;
	}
	
	//traverse
	public void traverseLL() {
		Node tempNode = head;
		for(int i = 0; i< size; i++) {
			System.out.print(tempNode.value);
			if(i != size - 1) {
				System.out.print(" -> ");
			}
			tempNode = tempNode.next;
		}
		System.out.print("\n");
	}
}
