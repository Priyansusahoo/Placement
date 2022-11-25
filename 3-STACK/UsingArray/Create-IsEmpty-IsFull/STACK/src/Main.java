public class Main {
    public static void main(String[] args) {
        Stack newStack = new Stack(4);
        boolean resultEmpty = newStack.isEmpty();
        System.out.println(resultEmpty);
        boolean resultFull = newStack.isFull();
        System.out.println(resultFull);
    }
}