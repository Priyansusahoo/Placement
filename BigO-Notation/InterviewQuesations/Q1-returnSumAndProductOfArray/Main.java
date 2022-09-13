class Main{
	public static void main(String[] args){
		Main main = new Main();
		int[] customArray = {1, 3, 4, 5};
		main.spOfArray(customArray);
	}
	public void spOfArray(int[] array){
		int sum = 0;
		int product = 1;
		/**
		 * for-loop for sum of array
		 */
		for (int i = 0; i < array.length;i++){
			sum += array[i];
		}
		/**
		 * for-loop for product of array
		 */
		for (int i = 0; i < array.length;i++){
			product *= array[i];
		}
		System.out.println("sum is " + 
				sum + ", product is " + product);
	}
	//Time Complexity = O(n)
}
