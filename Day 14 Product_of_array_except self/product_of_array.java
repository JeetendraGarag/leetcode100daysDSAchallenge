class Solution {
    public int[] productExceptSelf(int[] nums) {
      int n = nums.length;
      int[] a=new int[n];
      int p=1;

      for(int i =n-1;i>=0;i--){
        p=p*nums[i];
        a[i]=p;
      }
      int[] ans=new int[n];
      int b=1;
      for(int i =0;i<n-1;i++){
        int v=b*a[i+1];
        ans[i]=v;
        b=b*nums[i];
      }ans[n-1]=b;
      return ans;
    }
}