public class Challenge {
    public static void main(String[] args) {
        /**
         * Operator Challenge
         */
        double FirstVariable = 20.00d;
        double SecondVariable = 80.00d;
        double S3Result = (FirstVariable + SecondVariable) * 100.00;
        System.out.println("MyValueTotal = " + S3Result);
        double S4Result = S3Result % 40.00d;
        System.out.println("theRemainder = " + S4Result);

        /**
         * replace ->
         */
//        boolean S5Result;
//        if (S4Result == 0){
//            System.out.println("True");
//            return S5Result = true;
//        }
//        else {
//            System.out.println("False");
//            return S5Result = false;
//        }
        /**
         * replace END
         */

        //Replacing using Ternary Operator (Preferred)
        boolean S5Result = (S4Result == 0) ? true : false;
        System.out.println("isNoRemainder = " + S5Result);

        if (!S5Result) {
            System.out.println("Got Some remainder");
        }
    }
}
