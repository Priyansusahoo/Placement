package PracticeSelectionSort;

public class Sort {
    public static void main(String[] args) {
        int[] a = { -1, 2, 5, -8, 10, 50, 60 }; // lenght = 7

        for (int LUE = a.length - 1; LUE > 0; LUE--) {
            int max = 0;
            for (int i = 1; i <= LUE; i++) {
                if (a[i] > a[max]) { // change (a[i] < a[max])-> Descending Order.
                    max = i;
                }
            }
            SWAP(a, max, LUE);
        }
        printArray(a);
    }

    // printArray()
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // SWAP()
    public static void SWAP(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

}
