Increasing Triplet Subsequenceclass Solution {
    public boolean increasingTriplet(int[] nums) {
        int l=Integer.MAX_VALUE;
        int j=Integer.MAX_VALUE;
        int k=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){ 
              int m=nums[i]  ;
         if(l>=m){
            l=m; 
         }else if(j>=m){
            j=m;
              
         }else
         {
            k=m; 
            return true;
         }


        }
        return false;
    }
}