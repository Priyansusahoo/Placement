public class Main {
    public static void main(String[] args) {
        int arr[] = { -2, 1, 6000, 700 };
        int largest = arr[0];
        int SecLargest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                SecLargest = largest;
                largest = arr[i];
            } else if (SecLargest < arr[i]) {
                SecLargest = arr[i];
            }
        }
        System.out.println("Fist largest number is " + largest + " and Second largest Number is " + SecLargest);
    }
}
