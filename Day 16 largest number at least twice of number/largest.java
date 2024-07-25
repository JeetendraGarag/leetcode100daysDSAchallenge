class Solution {
    public int dominantIndex(int[] nums) {
        int max=-1;
        int secmax=-1;
        int ind=0;
        for(int i = 0 ;i<nums.length;i++){
            if(max<nums[i]){
                secmax=max;
                max=nums[i];
                ind=i;
            }else
            if(secmax<nums[i]){
                secmax=nums[i];
            }
        }
        if(secmax*2<=max){
            return ind;
        }else{
            return -1;
        }
    }
}