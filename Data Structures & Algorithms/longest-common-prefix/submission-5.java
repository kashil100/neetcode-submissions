class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1 || strs[0].length() == 0){
            return strs[0];
        }

        char[] mp = strs[0].toCharArray();
        int point = mp.length-1;

        for(int i =1;i<strs.length;i++){
            if(strs[i].length() == 0){
                return "";
            }

            for(int k = 0;k< Math.min(mp.length, strs[i].length());k++){
                if(mp[k] != strs[i].charAt(k)){
                    point = Math.min(point,k-1);
                    break;
                }

                if(k == Math.min(mp.length, strs[i].length()) - 1){
                    point = Math.min(point,k);
                }
            }
            if(point == -1){
                return "";
            }
        }

        String ans = "";
        for(int i = 0;i<=point;i++){
            ans+=mp[i];
        }

        return ans;
    }
}