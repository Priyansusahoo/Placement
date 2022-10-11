import java.util.Scanner;

public class Temp {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getInteger(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed values was "
                    + myIntegers[i]);
        }
    }

    public static int[] getInteger(int numbers){
        System.out.println("Enter " + numbers + " integer values.\r");
        int[] values = new int[numbers];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
}
