class Main{
	public static void main(String[] args){
		Main recursion = new Main();
		var rec = recursion.fibonacci(3);
		System.out.println(rec);
	}


	/**
	 * lang. StackOverflowError is a runtime error
	 * It  indicates that the application stack is
	 * exhausted and is usually caused by deep or infinite recursion.
	 */
	public int fibonacci(int n){
		if (n == 0 || n == 1){
			return n;
		}
		if (n<0){
			return -1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}

}
