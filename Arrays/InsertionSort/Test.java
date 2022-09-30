import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        for (int UFE = 1; UFE < intArray.length; UFE++) {
            int newElement = intArray[UFE];
            int i;
            for (i = UFE; i > 0
                    && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }
            intArray[i] = newElement;
        }
        System.out.println(Arrays.toString(intArray));
    }
}
