class Solution {
    public int maxProfit(int[] prices) {
        int j = 0;
        int profit = 0;
        for(int i = 1; i< prices.length;i++){
            if(prices[i] <= prices[j]){
                j = i;
            }else{
                profit = Math.max(profit, prices[i] - prices[j]);
            }
        }

        return profit;
        
    }
}
