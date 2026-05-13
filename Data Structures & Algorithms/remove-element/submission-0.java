class Solution {
    public int removeElement(int[] nums, int val) {
        int ans = 0;
        for(int k: nums){
            if(k!=val){
                ans++;
            }
        }
        int i = 0, j = nums.length - 1;
        while(true){
            while(j>=i && nums[j] == val){
                j--;
            }

            while(j>=i && nums[i] != val){
                i++;
            }

            if(i<=j){
                int swap = nums[i];
                nums[i] = nums[j];
                nums[j] = swap;
            }else{
                break;
            }
        }

        return ans;
    }
}