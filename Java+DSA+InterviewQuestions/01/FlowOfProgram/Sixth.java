import java.util.Scanner;;

public class Sixth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rupees = input.nextInt();
        input.close();

        float USD = (float) (rupees / 79.67);
        System.out.println(String.format("%.03f", USD)
                + " USD");
    }
}
