class Solution {
    public int maxProfit(int[] prices) {

        int buyPrice = prices[0];
        int profit = 0;

        for(int i = 0; i < prices.length; i++) {
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            } 

            if (i + 1 < prices.length && buyPrice < prices[i + 1]) {
                int temp = prices[i + 1] - buyPrice;
                if (profit < temp) {
                    profit = temp;
                }
                
            }
        }
        return profit;
        
    }
}