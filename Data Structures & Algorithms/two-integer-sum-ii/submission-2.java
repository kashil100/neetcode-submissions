class Solution {
    public int[] twoSum(int[] nums, int target) {
        int j = 0;
        for(int i=nums.length-1;i>j;i--){
            int sum = nums[i] + nums[j];
            while(j<i && sum<target){
                j++;
                sum = nums[i] + nums[j];
            }
            if(sum == target){
                return new int[]{j+1, i+1};
            }
        }

        return new int[]{};

    }
}
