class Main{
	public static void main(String[] args){
		Main main = new Main();
		int [] customArray = {1, 3, 4, 5};
		main.printPairs(customArray);
	}

	void printPairs(int[] array){
		for(int i = 0;i < array.length; i++){ //O(N)
			for(int j = 0;j < array.length;j++){//O(N)
				System.out.println(array[i] +""+
						array[j]);//O(1)
			}
		}
	}
	//Time-Complexity = O(N)*O(N)*O(1) = O(N^2) 
}
