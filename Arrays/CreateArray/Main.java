import java.util.Arrays
class Main{
	public static void main(String[] args){
		//Declare
		int[] intArray;//O(1)
		//Instantiation of an array
		intArray = new int[3];//O(1)
		//Initialization
		intArray[0] = 1;//O(1)
		intArray[1] = 2;//O(1)---------> total O(N) time-complexity
		intArray[2] = 3;//O(1)

		System.out.println(Arrays.toString(intArray));

		/**
		 * All together -Declare,-Instantiation,-Initialization
		 */
		String sArray[] = {"a","b","c"};//O(1)
		System.out.println(Arrays.toString(sArray));

	}
	//Time-Complexity ----> O(N)
}
