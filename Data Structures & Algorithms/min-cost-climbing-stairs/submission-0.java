class Solution {
    public int fun(int[] cost, int[] dp, int n){
        if(n<0){
            return 0;
        }
        if(n == 0 || n == 1){
            return cost[n];
        }

        if(dp[n] != -1){
            return dp[n];
        }

        dp[n] = cost[n] + Math.min(fun(cost,dp,n-1), fun(cost,dp,n-2));
        return dp[n];
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return Math.min(fun(cost,dp,n-1), fun(cost,dp,n-2));
    }
}
