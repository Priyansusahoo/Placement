import org.jetbrains.annotations.NotNull;

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
 *
 * STEPS to Return Average of myInteger[]->
 * 1-create getAverage().
 * 2-Initialize an integer to store the sum of the array elements.
 * 3-create a for-loop to loop through the array
 * and add the elements to sum in every loop.
 * 4-return SUM/number of elements in the array.
 */
public class Temp2 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(2);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element in index " + i + " was " + myIntegers[i]);
        }
        System.out.println("Average of the array is " + getAverage(myIntegers));
    }
    //function to return array of input numbers.
    public static int[] getIntegers(int numbers){
        System.out.println("Enter " + numbers + " numbers\r");
        int[] values = new int[numbers];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
    //function to return average of the array.
    public static double getAverage(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double)sum/ (double)array.length;
    }
}
