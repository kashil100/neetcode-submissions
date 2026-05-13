class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n = piles.length;
        int l = 1, r = piles[n-1];
        int ans = Integer.MAX_VALUE;
        while(l<=r){
            int mid = l + (r-l)/2;
            int temp=0;
            for(int i=0;i<n;i++){
                temp+=(piles[i]/mid);
                temp+=(piles[i]%mid==0)?0:1;
            }

            if(temp<=h){
                ans = Math.min(ans,mid);
                r = mid-1;
            }else{
                l = mid+1;
            }
        }

        return ans;
    }
}
