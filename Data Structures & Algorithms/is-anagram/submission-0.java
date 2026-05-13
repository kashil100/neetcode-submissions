class Solution {
    public boolean isAnagram(String s, String t) {
        int[] mpS = new int[27];
        int[] mpT = new int[27];
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            mpS[ch-'a']++;
        }

        for(int i = 0;i<t.length();i++){
            char ch = t.charAt(i);
            mpT[ch-'a']++;
        }

        for(int i = 0;i<26;i++){
            if(mpS[i] != mpT[i]){
                return false;
            }
        }

        return true;
    }
}
