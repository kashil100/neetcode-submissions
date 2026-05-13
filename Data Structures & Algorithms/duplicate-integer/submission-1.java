class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i: nums){
            if(mp.containsKey(i)){
                return true;
            }

            mp.put(i,1);
        }
        return false;
    }
}