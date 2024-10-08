class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }else if(nums[0]<=nums[nums.length-1]){
            return nums[0];
        }
        int first=0;
        int last=nums.length-1;

        while(first<=last){
            int mid=(first+last)/2;
      
        if(mid!=0 && nums[mid-1]>nums[mid]){
            return nums[mid];
        }else if(mid!=nums.length-1 && nums[mid]>nums[mid+1]){
            return nums[mid+1];
        }else if(nums[first]<=nums[mid]){
            first=mid+1;
        }
        else{
          last=mid-1;
        }
        }
        return -1;
         
    }
}