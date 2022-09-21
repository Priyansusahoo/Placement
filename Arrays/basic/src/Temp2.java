import java.util.Scanner;
/**
 * Steps:
 * 1-create a private static scanner object.
 * 2-create an int[] myIntegers in main() which will have input from getIntegers() function.
 * 3-create getInteger()-> with int numbers as input.
 * 4-create a int[] named "values" in getInteger(), which will take "numbers" number of element as input.
 * 5-create a for-loop which will loop "numbers" times to take input from the console
 * 6-return the value[].
 * 7-In main(), create a for-loop which loop through myInteger[] and print the index and it's element.
 */
public class Temp2 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element in index " + i + " was " + myIntegers[i]);
        }
    }

    public static int[] getIntegers(int numbers){
        System.out.println("Enter " + numbers + " numbers\r");
        int[] values = new int[numbers];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
}
