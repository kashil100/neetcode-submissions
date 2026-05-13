class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length-1;
        int ans = nums[0];

        while(l<=r){
            int mid = l + (r-l)/2;
            if(ans > nums[mid]){
                ans = nums[mid];
                r = mid - 1;
            }else{
                l = mid+1;
            }
        }

        return ans;
        
    }
}
