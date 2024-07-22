class Solution {
    public int[] twoSum(int[] numbers, int target) {
         int [] ans= new int[2];
         int first=0; 
         int last=numbers.length-1;
         while(first<last){
            int sum=numbers[first]+numbers[last];  
            if(sum==target){
             ans[0]=first+1;
             ans[1]=last+1;
             return ans;

            }else  if(sum>target){
                last--;
            } else
        {
            first++;
        }
         }
       return ans;
    }
}