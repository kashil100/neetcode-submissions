class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        int[] ans = new int[k];
        for(int num: nums){
            mp.put(num, mp.getOrDefault(num,0)+1);
        }

        for(int i = nums.length;i>0 && k>0;){
            if(mp.containsValue(i)){
                for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
                    if(entry.getValue() == i){
                        ans[k-1] = entry.getKey();
                        mp.remove(ans[k-1]);
                        break;
                    }
                }
                k--;
            }else{
                i--;
            }
        }

        return ans;
    }
}
