public class Main{
	public static void main(String[] args){
		Main recursion = new Main();
		var rec = recursion.fib(4);
		System.out.println(rec);
	}
	public int fib(int n){
		//TODO
		if(n < 0){
			return -1;
		}
		if(n == 0 || n == 1){
			return n;
		}
		return fib(n - 1) + fib(n - 2);
	}
}
