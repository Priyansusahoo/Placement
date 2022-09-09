class Main{
	public static void main(String[] args){
		Main recursion = new Main();
		var powerIs = recursion.power(2, 2);
		System.out.println("power = " + powerIs);
	}

	public int power(int base, int expo){
		if(expo < 0){
			return 0;
		}
		if(expo == 0){
			return 1;
		}
		if(expo == 1){
			return base;
		}
		return base * power(base, expo -1);
	}
}
