class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int j = 0;
        Set<Integer> mp = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if((i-j) > k){
                mp.remove(nums[j]);
                j++;
            }

            if(mp.contains(nums[i])){
                return true;
            }

            mp.add(nums[i]);
        }

        return false;
        
    }
}