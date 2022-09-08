class Main{
	public static void main(String[] args){
		Main recursion = new Main();
		var rec = recursion.sumOfDigits(51);
		System.out.println("Sum = " + rec);
	}

	public int sumOfDigits(int n){
		if (n < 0){
			return -1;
		}
		if (n == 0){
			return 0;
		}
		return n % 10 + sumOfDigits(n/10);
	}
}
