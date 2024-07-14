class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
    int bot=numBottles;
   if(numBottles>=numExchange){
   for(int i=0;i<=numExchange;i++){
   int rem=numBottles/numExchange;
   int qut=numBottles%numExchange;
   bot=bot+rem;
   numBottles=rem+qut;
   }
  
   } return bot;   
   } 
}