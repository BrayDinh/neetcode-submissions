class Solution {
    public int maxProfit(int[] prices) {
        int curMin = prices[0];
        int curProfit = 0;

        for (int i = 0; i < prices.length; i++){
            
            if (prices[i] < curMin){
                curMin = prices[i];
            }

            if (prices[i] - curMin > curProfit){
                curProfit = prices[i] - curMin;
            }

        }
        
        return curProfit;
    }
}
