class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        for(int num: nums){
            mp.put(num, mp.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
            if(entry.getValue() > n/2){
                return entry.getKey();
            }
        }

        return -1;
    }
}