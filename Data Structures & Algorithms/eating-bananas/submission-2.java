class Solution {
    public int check(int[] piles, int k){
        int ans = 0;
        for(int num:piles){
            ans = ans + (num/k);
            if((num%k)!=0){
                ans++;
            }
        }

        return ans;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = 1000000000;
        // for(int num:piles){
        //     r = Math.max(r, num);
        // }
        // System.out.println(r);
        int ans = 1;
        while(l<=r){
            int k = l + (r - l)/2;
            int temp = check(piles, k);

            if(temp <= h){
                r = k - 1;
                ans = k;
            }else{
                l = k+1;
            }
        }
        
        return ans;
    }
}
