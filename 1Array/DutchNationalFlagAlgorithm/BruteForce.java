import java.util.Arrays;;

public class BruteForce {
    public static void main(String[] args) {
        int[] ary = { 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1 };
       
        BruteForce print = new BruteForce();
        print.sort(ary);
    }

    public void sort(int[] a) {
    // Arrays.sort(a);
    for (int i = 0; i < a.length - 1; i++) {
    for (int j = 0; j < a.length - 1 - i; j++) {
    if (a[j] > a[j + 1]) {
    // swap
    SWAP(a, j, j + 1);
    }
    }
    }
    printArray(a);
    }

    public void SWAP(int[] array, int i, int j) {
    int temp = array[j];
    array[j] = array[i];
    array[i] = temp;
    }

    public void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
    }
    }
}