class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        else if(nums[0]>nums[1]){
            return 0;
        }else if(nums[nums.length-1]>nums[nums.length-2]){
            return  nums.length-1;
        }else{
        int first=1;
        int last=nums.length-2;

        while(first<=last){
            int mid=(first+last)/2;
            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]){
                return mid;
            }
            else if(nums[mid]<nums[mid+1]){
                first=mid+1;
            }else
            {
                last=mid-1;
            }
         
        }
        return -1;
        }
    }
}