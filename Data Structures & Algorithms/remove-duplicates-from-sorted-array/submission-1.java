class Solution {
    public int removeDuplicates(int[] nums) {
        int key = nums[0];
        int k = -1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] == key){
                if(k == -1){
                    k = i;
                }

            }else{
                if(k!=-1){
                    nums[k++] = nums[i];
                }
                key = nums[i];
            }
        }

        return (k<0)?(nums.length):k;
    }
}