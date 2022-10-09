import java.util.Arrays;

public class TwoDimensionalArray {
    int arr[][] = null;

    // constructor
    public TwoDimensionalArray(int numberOdRows, int numberOfCloumns) {
        this.arr = new int[numberOdRows][numberOfCloumns];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    // Insertion value in the array
    public void insertValueInTheArray(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) { // TC: O(1)
                arr[row][col] = value; // O(1)
                System.out.println("Successfully inserted");// TC: O(1)
            } else {
                System.out.println("Cell is already occupied");// TC: O(1)
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D Array");// TC: O(1)
        }
        /**
         * Time-Complexity:- O(1)
         * Space-Complexity:- O(1)
         */
    }

    // Accessing cell value from the given array
    public void accessCell(int row, int col) {
        System.out.println("\nAccessing Row "
                + row + ", Col "
                + col); // O(1)
        try {
            System.out.println("Cell value is "
                    + arr[row][col]); // O(1)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index");// O(1)
        }
        /**
         * Time-Complexity: O(1)
         * Space-Complexity:- O(1)
         */
    }

    // Traverse 2D Array
    public void traverse2DArray() {
        for (int row = 0; row < arr.length; row++) { // TC: O(m) if number of rows in 2D Array is 'm'
            for (int col = 0; col < arr[row].length; col++) {// TC: O(n) if number of col in 2D Array is 'n'
                System.out.print(arr[row][col]
                        + " ");// TC: O(1)
            }
            System.out.println();// TC: O(1)
        }
        /**
         * Time-Complexity:- O(mn)
         * Space-Complexity:- O(1) -> no additional memory is required
         */
    }

    // Searching a single value from 2D Array
    public void search(int value) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == value) {
                    System.out.println(value
                            + " exists in the array in Row#"
                            + row + " and Col#" + col);
                    return;
                }
            }
        }
        System.out.println("Value not found");
    }
}
