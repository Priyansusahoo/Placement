import java.sql.SQLOutput;

public class Stack {
    SinglyLinkedList linkedList;

    // Constructor: Creation
    public Stack() {
        linkedList = new SinglyLinkedList();
    }

    // Push
    public void push (int value) {
        linkedList.insertionInLinkedList(value, 0);
        System.out.println("Inserted " + value + " in Stack.");
        /**
         * TC: O(1)
         * SC: O(1)
         */
    }

    // isEmpty
    public boolean isEmpty() {
        if (linkedList.head == null) {
            return true;
        } else {
            return false;
        }
        /**
         * TC: O(1)
         * SC: O(1)
         */
    }
    // Pop
    public int pop() {
        int result = -1;
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            result = linkedList.head.value;
            linkedList.deletionOfNode(0);
        }
        return result;
        /**
         * TC: O(1)
         * SC: O(1)
         */
    }
    // Peek
    public int peek() {
        if (linkedList.head == null) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            return linkedList.head.value;
        }
        /**
         * TC: O(1)
         * SC: O(1)
         */
    }
    // deleteStack
    public void deleteStack() {
        linkedList.head = null;
        System.out.println("Successfully deleted STACK :D");
        /**
         * TC: O(1)
         * SC: O(1)
         */
    }
}
