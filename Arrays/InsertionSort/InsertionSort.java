import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        for (int FUE = 1; FUE < intArray.length; FUE++) {
            int newElement = intArray[FUE];
            int i;
            for (i = FUE; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }
            intArray[i] = newElement;
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        // System.out.println(Arrays.toString(intArray));
    }
}
