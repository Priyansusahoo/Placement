import java.util.Arrays;
import java.util.Scanner;
public class SortedArray {
        public static int[] getIntegers(int numbers){
        System.out.println("Enter " + numbers + " of elemets\r");
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[numbers];
        for(int i=0;i<values.length;i++){
            values[i] = scanner.nextInt();
        }
        scanner.close();
        return values;
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println("Element " + i + " contents " + arr[i]);
        }
    }
    public static int[] sortIntegers(int[] arr){
        int[] temp = Arrays.copyOf(arr, arr.length);
        for(int i=0;i<temp.length-1;i++){
            for(int j=0;j<temp.length-1-i;j++){
                if(temp[j+1] > temp[j]){
                    int tempo = temp[j+1];
                    temp[j+1] = temp[j];
                    temp[j] = tempo;
                    
                }
            }
        }
        return temp;
    }
}