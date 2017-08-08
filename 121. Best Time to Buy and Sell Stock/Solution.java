public class Solution {
    public int maxProfit(int[] prices) {
            int maxProfit = 0, curProfit = 0;
            for(int i = 1; i < prices.length; i++){
                curProfit = Math.max(0, curProfit += prices[i] - prices[i - 1]);
                if(curProfit > maxProfit)
                    maxProfit = curProfit;
            }
            return maxProfit;
    }
//         public int maxProfit(int[] prices) {
//         if(prices.length == 0)
//             return 0;
//         int valley = prices[0];
//         int summit;
//         int maxProfit = 0;
//         int profit;
//         for(int i = 0; i < prices.length - 1; i++){
//             if(prices[i] > prices[i + 1]){
//                 if(prices[i + 1] < valley)
//                     valley = prices[i + 1];       
//             }
//             else{
//                 profit = prices[i + 1] - valley;
//                 if(profit >maxProfit)
//                     maxProfit = profit;
//             }
                
//         }
//         return maxProfit;
//     }
}