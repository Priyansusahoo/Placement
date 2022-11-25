public class Main {
    public static void main(String[] args) {
        Stack newStack = new Stack(4);
        //push
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        newStack.push(5);
        //Pop
        int popElement = newStack.pop();
        System.out.println("Element Poped is " + popElement);
        //isEmpty
        boolean resultEmpty = newStack.isEmpty();
        System.out.println("Is Empty: " + resultEmpty);
        //isFull
        boolean resultFull = newStack.isFull();
        System.out.println("Is Full: " + resultFull);
        //Peek
        int peekElement = newStack.peek();
        System.out.println("Top element is: " + peekElement);
        // check Peek
        int peekElement1 = newStack.peek();
        System.out.println("Top element CHECK is: " + peekElement1);
        //Delete
        newStack.delete();
    }
}