import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Main main = new Main();
		int[] customArray = {1, 3, 4, 5, 6, 7, 
			8, 9, 10, 11, 12, 13, 14, 15};
		main.reverse(customArray);
	}

	void reverse(int[] array){
		for(int i = 0;i < array.length/2; i++){
			int other = array.length - i - 1;
			int temp = array[i];
			array[i] = array[other];
			array[other] = temp;
		}
		System.out.println(Arrays.toString(array));
	}
}
