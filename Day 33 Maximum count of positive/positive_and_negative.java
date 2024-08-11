class Solution {
    public int maximumCount(int[] nums) {
        int lastnegIndex=lastNegative(nums)+1;
        int firstposIndex=nums.length-firstpositive(nums);

        return Math.max(lastnegIndex,firstposIndex);
    }
    public int lastNegative(int[]   nums){
        int start=0;
        int last= nums.length-1;
        int ans=-1;

        while(start<=last){
            int mid=(start+last)/2;

            if(nums[mid]<0){
                ans=mid;
                start=mid+1;

            }else{
                    last=mid-1;
            }
        }
        return ans;
    }
    public int firstpositive(int[] nums){
        int start=0; 
        int last=nums.length-1;

        int ans=nums.length;

        while(start<=last){
            int mid=(start+last)/2;

            if(nums[mid]>0){
                ans=mid;
                last=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
}