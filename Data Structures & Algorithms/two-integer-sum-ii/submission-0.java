class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            int num = target - nums[i];
            int l = 0, r = nums.length-1;
            while(l<=r){
                int mid = l + (r-l)/2;
                if(nums[mid] == num){
                    if(mid == i){
                        l = mid+1;
                    }else{
                        return new int[]{i+1, mid+1};
                    }
                }else if(nums[mid] > num){
                    r = mid - 1;
                }else{
                    l = mid + 1;
                }
            }
        }

        return new int[]{};
    }
}
