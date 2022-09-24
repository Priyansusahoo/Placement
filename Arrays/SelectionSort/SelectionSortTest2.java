public class SelectionSortTest2 {
    public static void main(String[] args) {
        int[] a = { 20, 35, -15, 7, 55, 1, -22 };

        for (int LUE = a.length - 1; LUE > 0; LUE--) {
            int max = 0;
            for (int i = 1; i <= LUE; i++) {
                if (a[i] > a[max]) {
                    max = i;
                }
            }
            swap(a, max, LUE);
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
    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
