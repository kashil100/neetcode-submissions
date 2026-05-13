class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return strs[0];
        }

        String ans = "";
        String temp = strs[0];
        for(int i = 1;i<strs.length;i++){
            int n = Math.min(temp.length(), strs[i].length());
            String sec = "";
            for(int j = 0;j<n;j++){
                if(temp.charAt(j) == strs[i].charAt(j)){
                    sec+=temp.charAt(j);
                }else{
                    break;
                }
            }
            temp = sec; ans = sec;
            if(ans == ""){
                break;
            }
        }

        return ans;
    }
}