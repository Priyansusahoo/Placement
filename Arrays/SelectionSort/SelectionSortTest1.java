//own
class SelectionSortTest1 {
    public static void main(String[] args) {
        // System.out.println("kcfdhesikujcbdhjvjf");
        int[] a = { 10, 70, 100, 50 };
        for (int i = 0; i < a.length - 1; i++) {
            int max = 0;
            if (a[i] < a[i + 1]) {
                max = a[i + 1];// points
            }
            for (int j = 0; j < a.length - 1; j++) {
                // value swap
                a[a.length - i - 1] = max;
            }
            printArray(a);
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}