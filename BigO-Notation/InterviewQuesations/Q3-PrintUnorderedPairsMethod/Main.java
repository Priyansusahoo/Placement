
class Main{
	public static void main(String[] args){
		Main main = new Main();
		int [] customArray = {1, 3, 4, 5};
		main.printPairs(customArray);
	}

	void printPairs(int[] array){
		for(int i = 0;i < array.length; i++){
		       for(int j = i+1;j < array.length;j++){
       			       System.out.println(array[i] +""+
						array[j]);
			}
		}
	}
	//Time-Complexity = N*N/2 = N^2/2 = O(N^2) 
}
