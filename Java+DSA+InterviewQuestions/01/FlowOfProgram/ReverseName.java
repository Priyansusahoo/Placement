import java.util.Scanner;

public class ReverseName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        input.close();

        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        System.out.println("reverse of the name is : " + reverse);
    }
}
