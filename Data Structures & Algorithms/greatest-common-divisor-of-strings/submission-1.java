class Solution {
    public int gcd(int a, int b){
        while(b!=0){
            int x = a%b;
            a = b;
            b = x;
        }
        return a;
    }
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }

        int temp = gcd(str1.length(), str2.length());
        return str1.substring(0,temp);
    }
}