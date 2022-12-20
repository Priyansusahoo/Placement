public class Main {
    public static void main(String[] args) {
        int[][] arr = { { 2, 3, 1 }, { 8, 5, 6 } };

        /**
         * For-Loop
         */
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }

        /**
         * For-each Loop
         */
        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}