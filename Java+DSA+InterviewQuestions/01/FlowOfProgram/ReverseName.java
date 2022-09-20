import java.util.Scanner;

public class ReverseName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        input.close();

        // created a string to store reverse String
        String reverse = "";

        // created a for-loop to loop the Entered String.
        /**
         * 1st it will start from last element of the String
         * e.g. "abc" here lenght is 3 but last element index is
         * 2 i.e. (0,1,2)or(lenght -1)
         * 2nd it will loop in decending order i.e. start from
         * 2->1->0. that is why i >=0 & i--.
         */
        for (int i = s.length() - 1; i >= 0; i--) {
            /**
             * there reverse = reverse + s.charAt(i).
             * charAt(i) will uniquely specify each element in
             * the String.
             * e.g. reverse = cb. then in the next loop it will be
             * cb + a = cba
             * That is why
             * reverse = reverse + charAt(i);
             */
            reverse += s.charAt(i);
        }
        // print the reverse string
        System.out.println("reverse of the name is : " + reverse);
    }
}
