class Solution {
    public int maxSubArray(int[] nums) {
        
        int bestsum = Integer.MIN_VALUE;
        int currentsum = 0;
        
        for(int i = 0;i<nums.length;i++){
            currentsum = Math.max(nums[i],currentsum+nums[i]);
            bestsum = Math.max(bestsum,currentsum);
        }
        return bestsum;
    }
}
