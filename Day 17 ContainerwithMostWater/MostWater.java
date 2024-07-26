class Solution {
    public int maxArea(int[] height) {
      int first=0 ;
      int last=height.length-1;
      int max=0;

      while(first<last){
          int len=Math.min(height[first],height[last]);
          int width= last-first;
          int c=len*width;
           max=Math.max(c,max);
           if(height[first]<height[last]){
            first++;
           }else{
            last--;
           }
      }

     return max;
    }
}