public class Main{
	public static void main(String[] args){
		Main recursion = new Main();
		var result = recursion.recursiveRange(6);
		System.out.println(result);
	}
        public int recursiveRange(int num) {
   	 //  TODO
   		 if(num < 0){
       			 return -1;
   	 	}
   		 if(num == 0){
       			 return 0;
   		 }
   		 return num + recursiveRange(num - 1);
 	      }
}
