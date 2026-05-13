class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n+1];
        prefix[0] = 1;
        int[] suffix = new int[n+1];
        suffix[n] = 1;

        for(int i = 0, j = n-1;i<n && j>=0;i++,j--){
            prefix[i+1] = prefix[i]*nums[i];
            suffix[j] = suffix[j+1]*nums[j];
        }

        int[] ans = new int[n];
        for(int i = 0;i<n;i++){
            ans[i] = prefix[i]*suffix[i+1];
        }

        return ans;
        
    }
}  
