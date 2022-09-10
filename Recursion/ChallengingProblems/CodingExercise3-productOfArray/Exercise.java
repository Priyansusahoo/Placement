public class Exercise {
    
    public int productofArray(int A[], int N){ 
    //   TODO
    //   could not figure out this if-condition
    if (N <= 0){
        return 1;
    } 
    /**
     * got this return function,
     * but could not guess the above if-condition
     */
    return (A[N-1] * productofArray(A, N-1));
    } 
}
