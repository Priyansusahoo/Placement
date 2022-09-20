import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        System.out.println(
                "Enter the principle(amount),Rate of interest(%), and Time(Years) respectively");
        Scanner input = new Scanner(System.in);

        int Principal = input.nextInt();
        int Rate = input.nextInt();
        float Time = input.nextFloat();

        input.close();

        Double SI = (double) (Principal * Rate * Time) / 100;

        System.out.println("The simple interest is " + SI);
    }
}
