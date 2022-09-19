public class Solution {
    public static void main(String[] args) {
        int[] array1 = new int[] { 1, 2, 3, 4, 5 };
        // print the usual array
        System.out.println("the original array is : ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        // printing the reverse array
        System.out.println("The reversed array is : ");
        for (int i = array1.length - 1; i >= 0; i--) { // start from last element->5-1 = 4(index)-> element is 5;
                                                       // until it is greater than or equal to 0;
                                                       // decrement
            System.out.print(array1[i] + " ");
        }
    }
}
