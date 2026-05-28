class Solution {
    public int check(int[] nums, int target, int l, int r){
        while(l<=r){
            int i = l + (r-l)/2;
            if(target == nums[i]){
                return i;
            }else if(target > nums[i]){
                l = i+1;
            }else{
                r = i-1;
            }
        }

        return -1;
    }
    public int search(int[] nums, int target) {
        int l=0, r=nums.length-1, temp = nums[0], k =0;
        while(l<=r){
            int i = l + (r-l)/2;
            if(nums[i] == target){
                return i;
            }
            if(temp <= nums[i]){
                temp = nums[i];
                k = i;
                l = i+1;
            }else{
                r = i-1;
            }
        }
        
        int x = check(nums, target, 0, k-1);
        int y = check(nums, target, k, nums.length-1);

        return Math.max(x,y);
    }
}
