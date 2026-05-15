class Solution {
    public int sumOfSquare(int n){
        int sum = 0;
        while(n>0){
            int x = n%10;
            sum = sum + (x*x);
            n/=10;
        }

        return sum;
    }
    public boolean isHappy(int n) {
        if(n == 1){
            return true;
        }
        Set<Integer> st = new HashSet<>();
        st.add(n);
        n = sumOfSquare(n);
        while(!st.contains(n)){
            if(n == 1){
                return true;
            }

            st.add(n);
            n = sumOfSquare(n);
        }

        return false;
        
    }
}
