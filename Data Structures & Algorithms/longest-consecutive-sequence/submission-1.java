class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Set<Integer> st = new HashSet<>();
        for(int num: nums){
            st.add(num);
        }

        Set<Integer> st1 = new HashSet<>();
        for(int num:nums){
            if(!st.contains(num-1)){
                st1.add(num);
            }
        }
        int ans = 1;
        for(int x: st1){
            int count = 1;
            while(st.contains(x+1)){
                count++;
                x++;
            }

            ans = Math.max(ans , count);
        }
        
        return ans;
    }
}
