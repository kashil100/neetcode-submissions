class Solution {
    public int majorityElement(int[] nums) {
        int k = 1;
        int ans = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(ans == nums[i]){
                k++;
            }else{
                if(k!=0){
                    k--;
                }

                if(k == 0){
                    ans = nums[i];
                }  
            }
        }

        return ans;
    }
}