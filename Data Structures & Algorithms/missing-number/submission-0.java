class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        long sum = (n*(n+1))/2;
        long temp = 0;
        for(int num: nums){
            temp+=num;
        }

        return (int)(sum-temp);
    }
}
