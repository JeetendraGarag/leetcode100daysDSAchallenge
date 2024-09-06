class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr= new int[n][n];
        int count=1;
        int minrow=0;
        int maxrow=n-1;
        int mincol=0;
        int maxcol=n-1;
        while(count<=n*n){
// minrow fixed and mincol-maxcol
    for(int col = mincol;col<=maxcol;col++){
       arr[minrow][col]=count;
       count++;
        }
        // maxcol is fixed and minrow+1-maxrow
    for(int row=minrow+1;row<=maxrow;row++){
        arr[row][maxcol]=count;
        count++;
    }
    // maxrow is fixed and maxcol-1 - mincol
    for(int coll=maxcol-1;coll>=mincol;coll--){
        arr[maxrow][coll]=count;
        count++;
    }
// mincol is fixed and maxrow-1 -- minrow+1
    for(int row=maxrow-1;row>=minrow+1;row--){
        arr[row][mincol]=count;
        count++;
    }
     mincol++;
     maxcol--;
     minrow++;
     maxrow--;
      }
      return arr;
    }
}