// it is an optimised solution of question best time to buy and sell stock
// its time complexity is O(n) and space complexity is O(1)....
//leetcode mid level question....


   class Solution {
    public int maxProfit(int[] prices) {
       int buy=Integer.MAX_VALUE;
       int sell=0;
       
       for(int i=0;i<prices.length;i++){
           buy=Math.min(buy,prices[i]);
           sell=Math.max(sell, prices[i]-buy);
       }
       return sell;
    }
}