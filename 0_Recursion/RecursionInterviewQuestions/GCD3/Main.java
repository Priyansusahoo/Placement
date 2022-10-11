class Main{
	public static void main(String[] args){
		Main recursion = new Main();
		var GCD = recursion.GCDfunction(8,4);
		System.out.println(GCD);
	}

	public int GCDfunction(int a, int b){
		if(a < 0 || b < 0){
			return -1;
		}
		if(b == 0){
			return a;
		}
		return GCDfunction(b, a%b);
	}
}
