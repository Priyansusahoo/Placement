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
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("Successfully inserted");
            } else {
                System.out.println("cell is already occupied");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D Array");
        }
    }
}
