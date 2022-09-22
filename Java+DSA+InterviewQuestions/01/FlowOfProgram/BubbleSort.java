import java.util.Scanner;

public class BubbleSort {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = getIntegers(5);
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }
        System.out.println();
    }

    public static int[] getIntegers(int numbers) {
        System.out.println(
                "Enter the how many elements want in the array ");
        numbers = scanner.nextInt();
        System.out.println("Enter " + numbers + " numbers\r");
        int[] values = new int[numbers];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
}
