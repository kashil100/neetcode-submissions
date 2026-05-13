class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i<operations.length;i++){
            String s = operations[i];
            if(s.equals("+")){
                int a = st.peek();
                st.pop();
                int b = a + st.peek();
                st.push(a);
                st.push(b);

            }else if(s.equals("C")){
                st.pop();

            }else if(s.equals("D")){
                int a = st.peek();
                st.push(2*a);

            }else{
                int x = Integer.parseInt(s);
                st.push(x);
            }
        }

        int sum = 0;
        while(!st.isEmpty()){
            sum = sum + st.peek();
            st.pop();
        }

        return sum;
        
    }
}