//maximumSumSubarray
class KadenAlgorithm {
    public static void main(String[] args) {
        KadenAlgorithm max = new KadenAlgorithm();
        int[] a = { 5, -4, -2, 6, -1 };
        int[] ary = { -4, -2, -1 };
        max.maxSumSequence(a);
        max.maxSumSequence(ary);
        System.out.println(max.maxSumSequence(a));
        System.out.println(max.maxSumSequence(ary));
    }

    public int maxSumSequence(int[] array) {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;

        for (int i = 0; i < array.length; i++) {
            curSum += array[i];
            if (curSum > maxSum) {
                maxSum = curSum;
            }
            if (curSum < 0) {
                curSum = 0;
            }
        }
        return maxSum;
    }
}