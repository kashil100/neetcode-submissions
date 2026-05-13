class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int j = 0;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if((i-j) > k){
                mp.remove(nums[j]);
                j++;
            }

            if(mp.containsKey(nums[i])){
                return true;
            }

            mp.put(nums[i],1);
        }

        return false;
        
    }
}