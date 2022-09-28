class ConVsMethod {
    public static void main(String[] args) {
        varb(1);
        // int i,j;
        ConVsMethod a = new ConVsMethod(10, 20);
        ConVsMethod b = new ConVsMethod(20, 30);

    }

    // constructor
    public ConVsMethod(int a, int b) {
        int i = a;
        int j = b;
    }

    public ConVsMethod(int a) {
        int i = a;
    }

    public static int varb(int n) {
        return 0;
    }

}