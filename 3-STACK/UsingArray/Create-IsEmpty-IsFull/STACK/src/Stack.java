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
//            System.out.println("is full");
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
     * Push
     */
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full...insertion unsuccessful");
        } else {
            arr[topOfStack+1] = value;
            topOfStack ++;
            System.out.println("Successfully inserted");
        }
        /**
         * Time-Complexity: O(1)
         * Space-Complexity: O(1)
         */
    }
    /**
     * Pop
     */
    public int pop() {
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        } else {
            int topElement = arr[topOfStack];
            topOfStack--;
            return topElement;
        }
        /**
         * Time-Complexity: O(1)
         * Space-Complexity: O(1)
         */
    }
    /**
     * Peek
     */
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            return arr[topOfStack];
        }
        /**
         * Time-Complexity: O(1)
         * Space-Complexity: O(1)
         */
    }
    /**
     * Delete
     */
    public void delete() {
        arr = null;
        System.out.println("Successfully deleted the STACK :D");
        /**
         * Time-Complexity: O(1)
         * Space-Complexity: O(1)
         */
    }
}
