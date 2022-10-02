import java.util.Scanner;

class Main {
    private static Scanner s = new Scanner(System.in);
    // create baseData[] of size 10.
    private static int[] baseData = new int[10];

    public static void main(String[] args) {
        // put integer values from console
        System.out.println("Enter 10 integers: ");
        getInput();
        // prints the input array.
        printArray(baseData);
        // resize the current array by calling resizeArray.
        // no paramerter required.
        resizeArray();
        System.out.println("Enter 12 integers: ");
        getInput();
        printArray(baseData);
    }

    private static void getInput() {
        for (int i = 0; i < baseData.length; i++)
            baseData[i] = s.nextInt();
    }

    // print the array which is passed in this function
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * create resizeArray().
     * 1- create a copy of the baseData[].
     * 2- create a new array by using 'new' keyword of baseData[].
     * 3- copy the content of temp array created to the new
     * baseData[] which is of size 12.By using loop.
     * 4- it will take no parameter.
     */
    private static void resizeArray() {
        int[] original = baseData;

        baseData = new int[12];
        for (int i = 0; i < original.length; i++) {
            baseData[i] = original[i];
        }
    }
}