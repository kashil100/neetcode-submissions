class Solution {
    public boolean check(int[] mp, int[] mp1){
        for(int i=0;i<26;i++){
            if(mp[i] != mp1[i]){
                return false;
            }
        }

        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        int[] mp = new int[26];
        int[] mp1 = new int[26];
        for(int i=0;i<s1.length();i++){
            mp[(int)(s1.charAt(i)-'a')]++;
            mp1[(int)(s2.charAt(i)-'a')]++;
        }
        if(check(mp,mp1)){
            return true;
        }
        int j = 0;
        for(int i = s1.length();i<s2.length();i++){
            mp1[(int)(s2.charAt(j)-'a')]--;
            mp1[(int)(s2.charAt(i)-'a')]++;
            j++;
            if(check(mp,mp1)){
                return true;
            }
        }

        return false;
    }
}
