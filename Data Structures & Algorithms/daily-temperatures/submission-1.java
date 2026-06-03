class Solution {
    public int[] dailyTemperatures(int[] nums) {
        if(nums.length == 1){
            return new int[]{0};
        }
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[nums.length];

        st.push(0);
        for(int i =1;i<nums.length;i++){
            while(!st.isEmpty() && nums[i] > nums[st.peek()]){
                int j = st.pop();
                ans[j] = i - j;
            }
            st.push(i);
        }

        return ans;

    }
}
