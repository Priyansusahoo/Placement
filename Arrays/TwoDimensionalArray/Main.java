import java.util.Arrays;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        // Declaration
        int[][] int2DArray;
        // Instantiate
        int2DArray = new int[2][2];
        // Initialization
        int2DArray[0][0] = 1;
        int2DArray[0][1] = 2;
        int2DArray[1][0] = 3;
        int2DArray[1][1] = 4;

        System.out.println(Arrays.deepToString(int2DArray));
    }
}