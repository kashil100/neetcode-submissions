class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            mp.put(nums[i],i);
        }

        int[] ans = new int[2];
        for(int i = 0;i<nums.length;i++){
            int temp = target - nums[i];
            if(mp.containsKey(temp)){
                int j = mp.get(temp);
                if(i>j){
                    ans[1] = i;
                    ans[0] = j;break;
                }else if(i<j){
                    ans[0] = i;
                    ans[1] = j;break;
                }
            }
        }

        return ans;
    }
}
