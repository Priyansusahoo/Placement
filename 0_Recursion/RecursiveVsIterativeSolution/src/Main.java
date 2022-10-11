public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("main function is running");
	//powerOfTwo(2);
	powerOfTwoIT(2);
    }
    /**
     * Recursion
     * Recursive Solution -
     */
    static int powerOfTwo(int n){
	if (n==0){
		return 1;
	} else {
		var power = 2*powerOfTwo(n-1);
		System.out.println(power);
		return power;
	}
    }
    /**
     * Iteration
     * Iterative Solution -
     */
    static int powerOfTwoIT(int n){
        var i = 0;
	var power = 1;
	while(i<n){
		power *= 2;
		i += 1;
	}
	System.out.println(power);
	return power;
    }
}
