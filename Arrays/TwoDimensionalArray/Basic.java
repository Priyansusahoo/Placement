import java.util.Arrays;

/**
 * Basic
 */
public class Basic {
    public static void main(String[] args) {
        // Declaration
        int[][] int2DArray;
        // Instantiate
        int2DArray = new int[2][2];
        // Initialization, Time-Complexity:- O(mn)
        int2DArray[0][0] = 1;
        int2DArray[0][1] = 2;
        int2DArray[1][0] = 3;
        int2DArray[1][1] = 4;

        System.out.println(Arrays.deepToString(int2DArray));

        /**
         * All together
         * Declaration,Instantiate,Initialization
         * Time-Complexity:- O(1)
         */
        String s2DArray[][] = { { "a", "b" }, { "c", "d" } };
        System.out.println(Arrays.deepToString(s2DArray));
    }
}

/**
 * Space-Complexity:- O(mn)
 */