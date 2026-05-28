class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0, r = nums.length-1;

        while(l<=r){
            int i = l + (r-l)/2;
            if(nums[i] == target){
                return true;
            }

            if (nums[l] == nums[i] && nums[i] == nums[r]) {
                l++;
                r--;
            }
            else if(nums[i]>=nums[l]){
                if(target >= nums[l] && target<nums[i]){
                    r = i - 1;
                }else{
                    l = i + 1;
                }
            }else{
                if(target > nums[i] && target <= nums[r]){
                    l = i + 1;
                }else{
                    r = i - 1;
                }
            }
        }

        return false;
    }
}