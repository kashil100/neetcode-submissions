class Solution {
    public boolean isAnagram(String s, String t) {
        int[] mp = new int[26];
        for(int i = 0; i < s.length(); i++){
            mp[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < t.length(); i++){
            mp[t.charAt(i) - 'a']--;
        }

        for(int i = 0;i<26;i++){
            if(mp[i] != 0 ){
                return false;
            }
        }

        return true;
    }
}
