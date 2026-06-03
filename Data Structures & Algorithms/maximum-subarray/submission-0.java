class Solution {
    public int maxSubArray(int[] nums) {
        int j = 0;
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            sum+=nums[i];
            ans = Math.max(ans, sum);
            while(sum < 0 && j<=i){
                sum-=nums[j];
                j++;
            }
        }

        return ans;
    }
}
