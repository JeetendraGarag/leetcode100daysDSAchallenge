class Solution {
    public int maxProduct(int[] nums) {
        int max=-1,secmax=-1,pro=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(max<nums[i]){
                secmax=max;
                max=nums[i];
              
            }
            else
             if(secmax < nums[i])
            {
                // max=nums[i+1];
                secmax=nums[i];
            }
        }
        // max-=1;
        // secmax-=1;
        pro=(max-1)*(secmax-1);
        return pro;
    }
}