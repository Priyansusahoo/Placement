import java.util.Scanner;

public class BubbleOWN {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = getIntegers();
        // int[] arr = { 6, 7, 5, 2, 6, 1 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] > arr[j]) { // change ">" to "<" for ascending-order.
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArr(arr);

    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] getIntegers() {
        System.out.println("Enter how many elements u want in the array ");
        int numbers = scanner.nextInt();
        System.out.println("Enter " + numbers + " elements\r");
        int[] values = new int[numbers];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
}
