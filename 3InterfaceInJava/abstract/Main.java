/**
 * Programming --> abstract class
 */
abstract class Programming {
    public abstract void Developer();

    public abstract void Rank();
}

/**
 * HTML
 */
abstract class HTML extends Programming {
    @Override
    public void Developer() {
        System.out.println("Developer is Tim");
    }
}

/**
 * Java
 * all control in Java class.
 */
class Java extends HTML {
    @Override
    public void Rank() {
        System.out.println("Rank is 2nd");
    }
}

/**
 * Main
 */
class Main {
    public static void main(String[] args) {
        Programming j = new Java();
        j.Developer();
        j.Rank();
    }
}