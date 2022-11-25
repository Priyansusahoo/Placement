/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Stack newStack = new Stack(4);
        boolean empty = newStack.isEmpty();
        System.out.println("Stack is Empty? : " + empty);
        boolean full = newStack.isFull();
        System.out.println("Stack is full? : " + full);
    }
}