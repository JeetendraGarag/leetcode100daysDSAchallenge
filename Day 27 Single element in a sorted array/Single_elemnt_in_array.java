class Solution {
    public int singleNonDuplicate(int[] nums) {
        int first=0;
        int last=nums.length-1;
        if(nums.length==1){
            return nums[0];
        }
        else if(nums[0]!=nums[1]){
             return nums[0];
        }
        else if(nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }
        while(first<=last){
            int mid=(first+last)/2;
            
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];

            }
            else if (mid % 2 == 1){
                 if(nums[mid-1]==nums[mid]){
                    first=mid+1;
                 }
                 else{
                    last=mid-1;
                 }
            }
            else{
                if(nums[mid]==nums[mid+1]){
                    first=mid+1;
                }
                else{
                    last=mid-1;
                }
            }
        }
        return -1;
    }
    
}