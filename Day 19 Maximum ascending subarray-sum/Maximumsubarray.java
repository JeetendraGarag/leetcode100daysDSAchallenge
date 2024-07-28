class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum1=nums[0];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                sum1=sum1+nums[i];
            }else{
                sum=Math.max(sum1,sum);
                sum1=nums[i];
            }
        }sum=Math.max(sum1,sum);
        return sum;
    }
}