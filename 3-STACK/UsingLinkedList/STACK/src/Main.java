public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Stack newStack = new Stack();
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        // isEmpty
        boolean resultMty = newStack.isEmpty();
        System.out.println(resultMty);
        // Pop
        int resultPop = newStack.pop();
        System.out.println(resultPop);
        // Pop-Test
        int resultPopTest = newStack.pop();
        System.out.println(resultPopTest);
        // Peek
        int resultPeek = newStack.peek();
        System.out.println(resultPeek);
        // Peek-Test
        int resultPeekTest = newStack.peek();
        // delete Stack
        System.out.println(resultPeekTest);
        newStack.deleteStack();
        // check-Peek
        int resultPeekTest1 = newStack.peek();
        System.out.println(resultPeekTest1);
    }
}