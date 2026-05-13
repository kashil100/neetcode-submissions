class Solution {
    public int majorityElement(int[] nums) {
        int ans = nums[0];
        int temp = 1;
        for(int i =1;i<nums.length;i++){
            if(nums[i] != ans){
                temp--;
                if(temp<0){
                    ans = nums[i];
                }
            }else{
                temp++;
            }
        }

        return ans;
        
    }
}