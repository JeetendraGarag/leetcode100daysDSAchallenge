class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftside= new int[n];
        leftside[0]=height[0];
    for(int i =1;i<n;i++){
        leftside[i]=Math.max(leftside[i-1],height[i]);
    }
    int[] rightside = new int[n];
    rightside[n-1]=height[n-1];
    for(int i= n-2; i>=0;i--){
        rightside[i]=Math.max(rightside[i+1],height[i]);
    }
        int ans=0;
        for(int i =0;i<n;i++){
            ans+=Math.min(leftside[i],rightside[i])-height[i];
        }
    return ans;
    }

}