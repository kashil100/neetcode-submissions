class Solution {
    public int[] asteroidCollision(int[] nums) {
        Deque<Integer> st = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        for(int num: nums){
            if(num < 0){
                boolean say = true;
                while(!st.isEmpty() && st.peek()<=Math.abs(num)){
                    if(st.peek()==Math.abs(num)){
                        st.pop();
                        say = false;
                        break;
                    }
                    st.pop();
                }
                if(st.isEmpty() && say){
                    list.add(num);
                }
            }else{
                st.push(num);
            }
        }

        Deque<Integer> st1 = new ArrayDeque<>();
        while(!st.isEmpty()){
            st1.push(st.poll());
        }
        while(!st1.isEmpty()){
            list.add(st1.poll());
        }

        int[] ans = list.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }
}