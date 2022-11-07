import java.util.Scanner;

class Priyansu implements client {
    String name;
    double sal;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name");
        name = scanner.nextLine();

        System.out.println("Enter Salary");
        sal = scanner.nextDouble();
        scanner.close();
    }

    public void output() {
        System.out.println("Name is "
                + name
                + " & Salary is " + sal);
    }
}