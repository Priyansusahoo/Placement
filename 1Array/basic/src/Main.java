public class Main {
    public static void main(String[] args) {

        //method-3
        int[] arr4 = new int[10];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = i * 10;
            System.out.print(arr4[i] + " ");
        }
        System.out.println("\n");
        //called the function and passed the parameter(arr4)
        printArray(arr4);
    }
        //created a funtion to print the position and its element
        public static void printArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.println("Element " + i + "position value is " + array[i]);
            }
        }
}


////        //method-2
////        int[] arr3 = {1,2,3,4,5,6,7,8,9,10};
//
//////method-1
////        int[] arr = new int[10];
////        arr[5] = 50;
////        double[] arr2 = new double[10];
//////        System.out.println(arr[5]);
////
//        for (int i = 0; i < arr3.length; i++) {
//            System.out.print(arr3[i] + ", ");
//        }
//    }
