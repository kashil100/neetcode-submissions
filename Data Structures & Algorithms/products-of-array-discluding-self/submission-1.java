class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n+1];
        int[] suffix = new int[n+1];
        prefix[0] = 1;
        suffix[n] = 1;
        for(int i = 0;i<n;i++){
            prefix[i+1] = nums[i]*prefix[i];
        }

        for(int i = n-1;i>=0;i--){
            suffix[i] = nums[i]*suffix[i+1];
        }
        int j = 1;
        for(int i = 0; i<n;i++){
            nums[i] = prefix[i]*suffix[j];
            j++;
        }

        return nums;
        
    }
}  
