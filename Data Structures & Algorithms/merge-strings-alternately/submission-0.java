class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        int i;
        for(i = 0;i<Math.min(word1.length(), word2.length());i++){
            ans = ans + word1.charAt(i) + word2.charAt(i);
        }
        
        if(i == word1.length()){
            ans = ans + word2.substring(i);
        }else if(i == word2.length()){
            ans = ans + word1.substring(i);
        }

        return ans;
        
    }
}