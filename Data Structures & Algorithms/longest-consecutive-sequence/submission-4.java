class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int num:nums){
            st.add(num);
        }

        int ans = 0, count = 0;
        for(int s:st){
            count = 0;
            int num = s;
            if(!st.contains(num-1)){
                while(st.contains(num)){
                    num++;
                    count++;
                }
            }

            ans = Math.max(count, ans);
        }

        return ans;
    }
}
