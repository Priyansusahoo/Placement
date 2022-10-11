public class Main{
	public static void main(String[] args){
		Main recursion = new Main();
		var rec = recursion.factorial(4);
		System.out.println(rec);
	}
	
	public int factorial(int n){
		if (n<0){
			return -1;
		}
		if (n == 0 || n == 1){
			return 1;
		}
		return n * factorial(n-1);
	}

}
