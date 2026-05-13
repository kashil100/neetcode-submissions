class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int l = 1;
        int r=0;
        for(int w:weights){
            r+=w;
        }
        int ans = Integer.MAX_VALUE;
        while(l<=r){
            int mid = l+ (r-l)/2;
            int temp=0, sec=0;
            for(int i=0;i<n;i++){
                if(weights[i] > mid){
                    sec = days+2;break;
                }
                temp+=weights[i];
                if(temp>mid){
                    temp = weights[i];
                    sec++;
                }else if(temp == mid){
                    temp = 0;
                    sec++;
                }
            }

            sec+=(temp<=mid)?1:(days+2);
            if(temp==0){
                sec--;
            }

            if(sec<=days){
                ans =Math.min(ans,mid);
                r = mid-1;
            }else{
                l = mid+1;
            }
        }

        return ans;
    }
}