class Solution {
    public int missingNumber(int[] nums) {
     int n=nums.length;
     int actsum=0,corsum=0,rem=0;
     for(int i =0 ; i < n ; i++){
        actsum=actsum+nums[i];
     }   
     corsum=(n*(n+1))/2;
  
     rem=corsum-actsum;

     return rem;    

    }
}