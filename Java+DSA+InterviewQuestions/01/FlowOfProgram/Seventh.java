import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.close();

        long firstTerm = 0;
        long sencondTerm = 1;
        System.out.println("Fibonacci Series is: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");
            Long nextTerm = firstTerm + sencondTerm;

            firstTerm = sencondTerm;
            sencondTerm = nextTerm;
        }
    }
}
