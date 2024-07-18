class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sol= merge(nums1,nums2);
        
        if(sol.length%2==0){
            double solution= (double) (sol[sol.length/2]+sol[sol.length/2-1])/2;
            return solution;
        }else
        {
            double solution=(double) (sol[sol.length/2]);
            return solution;
        }

    }
   public  int[] merge(int[] arr1,int[] arr2){
        int [] solu=new int[arr1.length+arr2.length];
        int p1=0,p2=0,p3=0;

        while(p1<arr1.length|| p2<arr2.length){
            int val1=p1<arr1.length ? arr1[p1] : Integer.MAX_VALUE;
            int val2=p2<arr2.length ? arr2[p2] : Integer.MAX_VALUE;

            if(val1<val2){
                solu[p3]=val1;
                p1++;
            }else
            {
                solu[p3]=val2;
                p2++;
            }
            p3++;
        }
        return solu;
    }
}