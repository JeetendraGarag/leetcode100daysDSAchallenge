class Solution {
    public int mySqrt(int x) {
        long right=(x/2)+1,left=0;
        while(left<right){
            long mid= left +(right-left)/2+1;
            long sqr= mid*mid;
            if(sqr==x){
                return (int )mid;
            }else if(sqr<x){
                left=mid;
            }
            else{
                right=mid-1;
            }

        } return (int) left;
    }
}