public class SecondLargestAndSamllest {

    public static void main(String[] args) {
        int arr[] = { 2, -2, 1, 6000, 700, 700 };
        int Largest = arr[0];
        int SecLargest = arr[0];
        int Smallest = arr[0];

        // Second Largest CODE:
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Largest) {
                SecLargest = Largest;
                Largest = arr[i];
            } else if (SecLargest < arr[i]) {
                SecLargest = arr[i];
            }
        }
        // smallest element CODE:
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < Smallest) {
                Smallest = arr[i];
            }
        }

        System.out.println("Second Largest Element in the array is " + SecLargest
                + " and the smallest element in the array is " + Smallest);
    }

}
