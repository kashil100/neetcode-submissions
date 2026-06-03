class Solution {
    public int[] dailyTemperatures(int[] nums) {
        if(nums.length == 1){
            return new int[]{0};
        }
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();
        int[] ans = new int[nums.length];

        st.push(nums[0]);
        st1.push(0);
        int temp = Integer.MAX_VALUE;
        for(int i =1;i<nums.length;i++){
            while(!st.isEmpty() && nums[i] > st.peek()){
                st.pop();
                int j = st1.pop();
                ans[j] = i - j;
            }
            st.push(nums[i]);
            st1.push(i);
        }

        return ans;

    }
}
