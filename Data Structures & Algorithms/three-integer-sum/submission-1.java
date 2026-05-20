class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        Set<List<Integer>> st = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();

        for(int num: nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int temp = 0 - (nums[i] + nums[j]);
                if(mp.containsKey(temp)){
                    if(temp == nums[i] || temp == nums[j]){
                        int k = 1;
                        if(temp == nums[i] && temp == nums[j]){
                            k = 2;
                        }
                        if(mp.get(temp) > k){
                            List<Integer> list = Arrays.asList(nums[i],nums[j],temp);
                            Collections.sort(list);
                            if(!st.contains(list)){
                                st.add(list);
                                ans.add(new ArrayList(list));
                            }
                        }
                    }else{
                        List<Integer> list = Arrays.asList(nums[i],nums[j],temp);
                        Collections.sort(list);
                        if(!st.contains(list)){
                            
                            st.add(list);
                            ans.add(new ArrayList(list));
                        }
                    }
                }
            }
        }

        return ans;
        
    }
}
