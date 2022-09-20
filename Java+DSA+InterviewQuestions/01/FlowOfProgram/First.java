import java.util.Scanner;

class First {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        input.close();

        if (a % 2 == 0) {
            System.out.println("is even");
        } else {
            System.out.println("is odd");
        }
    }

}