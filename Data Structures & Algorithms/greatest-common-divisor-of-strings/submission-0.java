class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String ans = "", temp="";
        for(int i = 0;i< Math.min(str1.length(), str2.length());i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return "";
            }
            temp = temp + str1.charAt(i);
            String s1="", s2="";
            for(int j =0;j<(str1.length()/temp.length());j++){
                s1 = s1 + temp;
            }

            for(int j =0;j<(str2.length()/temp.length());j++){
                s2 = s2 + temp;
            }

            if(s1.equals(str1) && s2.equals(str2)){
                ans = temp;
            }
        }

        return ans;
        
    }
}