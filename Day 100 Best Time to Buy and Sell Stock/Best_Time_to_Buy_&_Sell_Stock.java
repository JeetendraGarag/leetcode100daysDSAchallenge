class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] max= new int[n];
        max[n-1]=prices[n-1];
        for(int i = n-2;i>=0;i--){
            max[i]=Math.max(max[i+1],prices[i]);
        }
        int ans= 0;
        for(int i =0;i<prices.length;i++){
            int curprice=max[i]-prices[i];
            ans= Math.max(ans,curprice);
         }
         return ans;
    }
}