class Solution {
    public double average(int[] salary) {
        int minsal=salary[0];
        int maxsal=salary[0];
        int sum=salary[0];

        for(int i =1;i<salary.length;i++){
            if(maxsal<salary[i]){
             maxsal=salary[i];
            }
            else if(minsal>salary[i]){
                minsal=salary[i];
            }
            sum=sum+salary[i];
            
           
        }
         sum=sum-minsal-maxsal;
            double answer=(double)sum/(salary.length-2);
            return answer;

    }
}