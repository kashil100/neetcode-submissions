class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 || s.length() == 1){
            return s.length();
        }
        Set<Character> st = new HashSet<>();
        int ans = 0, j =0;
        for(int i =0;i<s.length();i++){
            if(!st.contains(s.charAt(i))){
                st.add(s.charAt(i));
                ans = Math.max(ans, i-j+1);
            }else{
                while(j<i && st.contains(s.charAt(i))){
                    st.remove(s.charAt(j));
                    j++;
                }
                st.add(s.charAt(i));
            }
        }

        return ans;
    }
}
