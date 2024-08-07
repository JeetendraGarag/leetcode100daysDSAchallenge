class Solution {
    public int maxSubArray(int[] nums) {
        int Currsum=nums[0];
        int maxsum=nums[0];
        for(int i = 1; i<nums.length;i++){
         if(Currsum + nums[i] > nums[i]){
            Currsum+=nums[i];
         }
         else{
            Currsum= nums[i];
         }
         maxsum=Math.max(maxsum, Currsum);
        }
        return maxsum;
    }
}