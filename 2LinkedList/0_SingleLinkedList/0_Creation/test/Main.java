package test;

public class Main {
    public static void main(String[] args) {
        SinglyLL sLL = new SinglyLL();
        sLL.createSinglyLL(5);
        System.out.println(sLL.head.value);
    }
}