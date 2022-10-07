public class SingleDimensionArray {
    int arr[] = null;

    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int index, int value) {
        try {
            if (arr[index] == Integer.MIN_VALUE) { // O(1)
                arr[index] = value;// O(1)
                System.out.println("Insertion success at index "
                        + index
                        + " with value "
                        + value);// O(1)
            } else {
                System.out.println("Not Success - The index "
                        + index
                        + " is not empty");// O(1)
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(index
                    + " is a invalid index");// O(1)
        }
        /**
         * Time-Complexity for insert: O(1)
         */
    }

    // Array Traversal
    public void traverseArray() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("Array no longer exists");
        }
    }

    // Search for an element in the given Array
    // Linear-Search
    public void searchElementInArray(int element) {

        for (int i = 0; i < arr.length; i++) {// O(N)
            if (arr[i] == element) {// O(1)
                System.out.println("Element found at index " + i); // O(1)
                return;
            }
        }
        System.out.println(element + " not found"); // O(1)

        /**
         * Time-Complexity for searchElementInArray :- O(N)
         * Space-Complexity :- O(1)
         */
    }

    // delete element in the array
    public void deleteElement(int deleteElementIndex) {
        try {
            arr[deleteElementIndex] = Integer.MIN_VALUE; // O(1)
            System.out.println("Index " + deleteElementIndex + " deleted successfully"); // O(1)
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index " + deleteElementIndex + " is Invalid");// O(1)
        }
        /**
         * Time-Complexity :- O(1)
         * Space-Complexity :- O(1)
         */
    }
}
