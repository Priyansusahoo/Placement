import java.util.Random;

public class Ramdom {
    /**
     * Topics covered:
     * how to assign values to the array
     * random class
     * enhanced for-loop
     * Exception handling
     */

    public static void main(String[] args) {
        Random r = new Random();
        int a[] = new int[50];

//        a[0] = 1;
//        a[1] = 2;
//        a[2] = 3;
//        a[3] = 4;
//        a[4] = 5;

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(50);
        }

        /**
         * Exception handling
         * START
         */
        try
        {
            System.out.println(a[52]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Maximum index is 49");
        }
        /**
         * END
         */

//        for (int i = 0; i<a.length;i++){
//            System.out.println(a[i]);
//        }
        for (int i : a){
            System.out.println(i);
        }
    }
}
