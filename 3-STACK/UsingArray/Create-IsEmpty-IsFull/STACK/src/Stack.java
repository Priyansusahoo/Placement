public class Stack {
    int arr[];
    int topOfStack;

    /**
     * Creation
     */
    public Stack(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("created stack of size " + size);
        /**
         * Time-Complexity: O(1)
         * Space-Complexity: O(N)
         */
    }
    /**
     * isEmpty
     */
    public boolean isEmpty() {
        if (topOfStack == -1) {
            return true;
        } else {
            return false;
        }
        /**
         * Time-Complexity: O(1)
         * Space-Complexity: O(1)
         */
    }
    /**
     * isFull
     */
    public boolean isFull() {
        if (topOfStack == arr.length - 1) {
            System.out.println("is full");
            return true;
        } else {
            return false;
        }
        /**
         * Time-Complexity: O(1)
         * Space-Complexity: O(1)
         */
    }
}
