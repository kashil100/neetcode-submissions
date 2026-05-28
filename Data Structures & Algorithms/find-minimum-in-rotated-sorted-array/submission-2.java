class Solution {
    public int findMin(int[] nums) {
        int ans = nums[0];
        int l = 0, r = nums.length-1;
        while(l<=r){
            int i = l + (r-l)/2;
            if(nums[i] < ans){
                ans = nums[i];
                r = i-1;
            }else{
                l = i+1;
            }
        }

        return ans;
    }
}
