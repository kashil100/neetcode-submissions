class Solution {
    public int characterReplacement(String s, int k) {
        int[] mp = new int[26];
        for(int i = 0;i<k;i++){
            mp[(int)(s.charAt(i) - 'A')]++;
        }
        int ans = k, j =0;
        for(int i =k;i<s.length();i++){
            mp[(int)(s.charAt(i) - 'A')]++;
            int c = 0,a=0;
            for(int x:mp){
                c+=x;
                a = Math.max(a,x);
            }
            while((c-a) >k && j<=i){
                c = 0;a=0;
                for(int x:mp){
                    c+=x;
                    a = Math.max(a,x);
                }
                if(c-a <= k){
                    break;
                }
                mp[(int)(s.charAt(j) - 'A')]--;
                j++;
            }

            ans = Math.max(ans, i-j+1);
        }

        return ans;
    }
}
