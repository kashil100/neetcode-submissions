class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0,1);

        int sum = 0, ans = 0;
        for(int num: nums){
            sum+=num;
            int temp = sum - k;
            ans+=(mp.getOrDefault(temp,0));
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }

        return ans;
    }
}