class Solution {
    public int count(int[] mp){
        int c = 0,a=0;
        for(int i=0;i<26;i++){
            c+=mp[i];
            a = Math.max(a,mp[i]);
        }

        return c-a;
    }
    public int characterReplacement(String s, int k) {
        int[] mp = new int[26];
        for(int i = 0;i<k;i++){
            mp[(int)(s.charAt(i) - 'A')]++;
        }
        int ans = k, j =0;
        for(int i =k;i<s.length();i++){
            mp[(int)(s.charAt(i) - 'A')]++;
            while(count(mp) > k && j<=i){
                mp[(int)(s.charAt(j) - 'A')]--;
                j++;
            }

            ans = Math.max(ans, i-j+1);
        }

        return ans;
    }
}
