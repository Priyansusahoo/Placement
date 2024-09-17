package interview_questions;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.create(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.insert(6);
        ll.traverse();

        System.out.println("tail: " + ll.tail.value);
        System.out.println("Head: " + ll.head.value);
    }
}
