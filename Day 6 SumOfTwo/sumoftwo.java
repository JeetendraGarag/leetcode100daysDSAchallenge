class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum=0;
        int [] ans=new int[2];
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n-1;j++){
                sum=nums[i]+nums[j];
                if(sum==target){
                ans[0]=i;
                ans[1]=j;
                }
            }
        }
        return ans;
    }
}