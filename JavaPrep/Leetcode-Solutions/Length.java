public class Length {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int count = 0;
        int i = 0;

        try {
            while (arr[i] != 0) {
                count++;
                i++;
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Lenght of the array = " + count);
        }
        System.out.println("Lenght of the array using lenght function = " + arr.length);
    }
}
