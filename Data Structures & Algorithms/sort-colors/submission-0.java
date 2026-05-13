class Solution {
    int i = 0;
    public void sort(int[] nums, int count, int a){
        while(count>0){
            nums[i++] = a;
            count--;
        }
    }
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        for(int num: nums){
            count[num]++;
        }

        sort(nums, count[0], 0);
        sort(nums, count[1], 1);
        sort(nums, count[2], 2);
        
    }
}