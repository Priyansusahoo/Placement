import java.util.Arrays;

public class ReverseArray {
    // write code here
    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int halfArray = array.length / 2;
        int maxArray = array.length - 1;
        for (int i = 0; i < halfArray; i++) {
            // swap
            int temp = array[i];
            array[i] = array[maxArray - i];
            array[maxArray - i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));

    }

}