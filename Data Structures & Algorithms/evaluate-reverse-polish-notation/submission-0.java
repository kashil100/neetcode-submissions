class Solution {
    public int fun(int a, int b, String s){
        if(s.equals("+")){
            b = b + a;
        }else if(s.equals("-")){
            b = b-a;
        }else if(s.equals("*")){
            b = b*a;
        }else{
            b = b / a;
        }

        return b;
    }
    public int evalRPN(String[] tokens) {
        Deque<Integer> st = new ArrayDeque<>();
        for(int i=0;i<tokens.length;i++){
            String s = tokens[i];
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                //int a = st.peek();
                int a = st.poll();
                //int b = st.peek();
                int b = st.poll();
                st.push(fun(a,b,s));
            }else{
                int x = Integer.parseInt(s);
                st.push(x);
            }
        }

        return st.peek();
    }
}
