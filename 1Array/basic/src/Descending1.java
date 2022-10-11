import java.util.Scanner;

public class Descending1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = getInteger(5);
        int[] printArray = sortInteger(arr);
        for (int i = 0; i < printArray.length; i++) {
            System.out.print(printArray[i]);
        }

    }
    public static int[] getInteger(int numbers){
        System.out.println("Enter " + numbers + " number\r");
        int[] temp = new int[numbers];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = input.nextInt();
        }
        return temp;
    }
    public static int[] sortInteger(int[] arr){
        int sort[] = new int[arr.length];
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] < arr[j+1]){ //change sign for ascending-order
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }
}
