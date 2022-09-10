public class Exercise {
    public static void main(String[] args){
     Exercise recursion = new Exercise();
     var rec = recursion.factorial(4);
     System.out.println(rec);
    }
    public int factorial(int num) {
    // TODO
    if(num < 0){
        return -1;
    }
    if(num == 0 || num == 1){
        return 1;
    }
    return num * factorial(num - 1);
  }

}
