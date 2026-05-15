class Solution {
    public int hammingWeight(int n) {
        int ans = 0, i=0;
        while(i<32){
            if(((n>>i) & 1)== 1){
                ans++;
            }

            i++;
        }

        return ans;
    }
}
