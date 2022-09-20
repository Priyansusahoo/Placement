import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number :");
        long a = input.nextLong();
        System.out.println("Enter 2nd number :");
        long b = input.nextLong();
        input.close();

        long max = a;

        if (b > a) {
            max = b;
        }
        System.out.println("Largest number is : " + max);
    }
}
