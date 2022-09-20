import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the 1st number ");
        int a = input.nextInt();
        System.out.println("Enter the 2nd number ");
        int b = input.nextInt();
        System.out.println(
                "Enter the operation to be performed (+,-,*,/)");

        char operator = input.next().charAt(0);
        input.close();
        float output = 0;
        if (operator == '+') {
            output = (float) (a + b);
        } else if (operator == '-') {
            output = (float) (a - b);
        } else if (operator == '*') {
            output = (float) (a * b);
        } else if (operator == '/') {
            output = (float) (a / b);
        } else {
            System.out.println("Invalid operator");
        }
        System.out.println(output);
    }
}
