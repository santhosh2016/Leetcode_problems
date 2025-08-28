class Solution {
    public int maxSubArray(int[] nums) {
       int cs=nums[0];
       int max=nums[0];
       for(int i=1;i<nums.length;i++){
        cs=Math.max(nums[i],nums[i]+cs);
        max=Math.max(cs,max);
       }
       return max;
       
        
    }
}