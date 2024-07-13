class Solution {
    public int tribonacci(int n) {
     int znum=0,fnum=1,snum=1,sum=0;
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else if(n==2){
            return 1;
        }
    else if(n>2)
   {
   for(int i = 2; i < n ; i++)
   {
     sum=znum+fnum+snum;
     znum=fnum;
     fnum=snum;
     snum=sum;
     }
  } return sum;
 }
}