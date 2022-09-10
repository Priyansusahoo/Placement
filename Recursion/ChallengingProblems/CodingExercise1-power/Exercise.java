public class Exercise {
    public static void main(String[] args){
        Exercise recursion = new Exercise();
        var rec = recursion.power(2,0);
        System.out.println(rec);
    }
    public int power(int base, int exponent) {
        // TODO
        if(base < 0 || exponent < 0){
            return -1;
        }
        if(exponent == 0){
            return 1;
        }
        return base * power(base, exponent - 1);
    }

}
