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
                System.out.println("Not Success - The index"
                        + index
                        + " is not empty");// O(1)
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(index
                    + " is a invalid index");// O(1)
        }
    }
}
/**
 * Time-Complexity: O(1)
 */