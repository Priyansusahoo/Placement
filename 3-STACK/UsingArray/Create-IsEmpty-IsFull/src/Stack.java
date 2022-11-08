/**
 * Stack
 */
public class Stack {
    int [] arr;
    int topOfStack;

    public Stack(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("Stack successfully created with size of "
                + size);
        /**
         * Time-Compexity: O(1)
         * Space-Complexity: O(N)
         */
    }

    // isEmpty
    public boolean isEmpty(){
        if (topOfStack == -1){
            return true;
        } else {
            return false;
        }
        /**
         * Time-Complexity: O(1)
         * Space-Complexity: O(1)
         */
    }

    // isFull
    public boolean isFull(){
        if (topOfStack == arr.length - 1){
            System.out.println("Stack is full"); return true;
        } else {
            return false;
        }
        /**
         * Time-Complexity: O(1)
         * Space-Complexity: O(1)
         */
    }
}
