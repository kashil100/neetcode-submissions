class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            mp.put(nums[i],i);
        }

        int temp;

        for(int i = 0; i<nums.length; i++){
            temp = target - nums[i];
            if(mp.containsKey(temp)){
                if(i != mp.get(temp)){
                    return new int[]{i,mp.get(temp)};
                }
            }
        }

        return new int[]{-1,-1};
    }
}
