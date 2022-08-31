public class Doll {

    private static int doll;

    public static void main(String[] args) {
        openrussianDoll(doll = 10);
    }

    static void openrussianDoll(int doll) {
        if (doll == 1) {
            System.out.println("All dolls are opened");
        } else {
            openrussianDoll(doll - 1);
            System.out.println(doll);
        }
    }
}
