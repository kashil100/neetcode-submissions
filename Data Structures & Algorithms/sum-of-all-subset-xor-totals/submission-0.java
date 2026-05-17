class Solution {
    private int sum = 0;
    public void solution(int[] nums, int i, int xor){
        if(i == nums.length){
            sum+=xor;
            return;
        }

        solution(nums,i+1,xor^nums[i]);
        solution(nums,i+1,xor);
    }
    public int subsetXORSum(int[] nums) {
        solution(nums, 0, 0);
        return sum;
    }
}