/**
 * Programming --> abstract class
 */
abstract class Programming {
    public abstract void Developer();
}

/**
 * HTML
 */
class HTML extends Programming {
    @Override
    public void Developer() {
        System.out.println("Developer is Tim");
    }
}

/**
 * Java
 */
class Java extends Programming {
    @Override
    public void Developer() {
        System.out.println("Developer is James");
    }
}

/**
 * Main
 */
class Main {
    public static void main(String[] args) {
        Programming h = new HTML();
        h.Developer();
        Programming j = new Java();
        j.Developer();
    }
}