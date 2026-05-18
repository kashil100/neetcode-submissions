class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 1){
            return 0;
        }else if(n == 2){
            return Math.max(0,prices[1]-prices[0]);
        }

        int profit = 0;
        int temp = 0;
        int curr = Math.min(prices[1],prices[0]);
        for(int i=1;i<n;i++){
            if(prices[i] > curr){
                profit+=(prices[i]-curr);
                curr = prices[i];
            }else if(prices[i]<curr){
                curr = prices[i];
            }
        }

        return profit + temp;
    }
}