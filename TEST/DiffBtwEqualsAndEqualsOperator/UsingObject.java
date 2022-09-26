public class UsingObject {
    public static void main(String[] args) {
        String a = new String("ABC");
        String b = new String("ABC");

        if (a.equals(b)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
