import java.util.Scanner;

public class MinimumElement {
    private static int readInteger() {
        // read an Integer
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        // return readElements(n)
        scanner.close();
        return a;

    }

    private static int[] readElements(int n) {
        // read "n" elements from the console
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }
        scanner.close();
        // return array containing all the elements entered
        return values;
    }

    private static int findMin(int[] arr) {
        // return minimum element in the array
        int minimum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            minimum = arr[0];
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < minimum) {
                    minimum = arr[j];
                }
            }

        }
        return minimum;
    }

}