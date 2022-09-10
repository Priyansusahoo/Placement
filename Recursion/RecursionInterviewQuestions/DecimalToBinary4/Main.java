class Main{
	public static void main(String[] args){
		Main recursion = new Main();
		var D2B = recursion.D2BFun(10);
		System.out.println(D2B);
	}

	public int D2BFun(int n){
		if(n == 0){
			return 0;
		}
		return n%2 + 10 * D2BFun(n/2);
	}
}
