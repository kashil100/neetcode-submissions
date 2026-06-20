class Solution {
    public void sortColors(int[] nums) {
        if(nums.length == 1){
            return;
        }
        int j = 0;
        int i = j+1;
        boolean say = false;
        while(j<nums.length && i < nums.length){
            if(say){
                if(nums[j]==1){
                    j++;
                }
                else if(nums[i] == 1){
                    int swap = nums[i];
                    nums[i] = nums[j];
                    nums[j] = swap;
                    j++;
                }
            }else{
                if(nums[j]==0){
                    j++;
                }
                else if(nums[i] == 0){
                    int swap = nums[i];
                    nums[i] = nums[j];
                    nums[j] = swap;
                    j++;
                }
                if(i == nums.length-1){
                    say = true;
                    i = j;
                }
            }
            i++;
        }
    }
}