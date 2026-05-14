class Solution {
    public String convertToTitle(int columnNumber) {
        int n = columnNumber;
        String ans = "";
        while(n>0){
            n--;
            int rem = n%26;
            n/=26;
            char ch = (char)('A' + rem);
            ans = ch + ans;
        }

        return ans;
    }
}