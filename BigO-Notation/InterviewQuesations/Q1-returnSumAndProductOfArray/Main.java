class Main{
	public static void main(String[] args){
		Main main = new Main();
		int[] customArray = {1, 3, 4, 5};
		main.spOfArray(customArray);
	}
	public void spOfArray(int[] array){
		int sum = 0;//O(1)
		int product = 1;//O(1)
		/**
		 * for-loop for sum of array
		 */
		for (int i = 0; i < array.length;i++){ //O(n)
			sum += array[i];//O(1)
		}
		/**
		 * for-loop for product of array
		 */
		for (int i = 0; i < array.length;i++){ //O(n)
			product *= array[i];//O(1)
		}
		System.out.println("sum is " + 
				sum + ", product is " + product); //O(1)
	}
	//Time Complexity = O(1)+O(1)+O(n)+O(1)+O(n)+O(1)+O(1) = O(2n) = O(n)
}
