public class FindLargest {
    public static void main(String[] args) {
        int arr[] = { -2, 1, 6000, -3, 10, 8 };
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
