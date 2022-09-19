import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

class First {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        if (a % 2 == 0) {
            System.out.println("is even");
        } else {
            System.out.println("is odd");
        }
    }

}