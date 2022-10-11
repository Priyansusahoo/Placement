public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("They There");
	firstMethod();
    }

    /**
     * Before going to Recursive Fucntion, we will learn
     * what normal functions are and how does it work
     */
    static void firstMethod(){
    	secondMethod();
	System.out.println("I am the first Method");
    }

    static void secondMethod(){
	thirdMethod();
	System.out.println("I am the second Method");
    }

    static void thirdMethod(){
	fourthMethod();
	System.out.println("I am the third Method");
    }

    static void fourthMethod(){
	System.out.println("I am the fourth Method");
    }
}
