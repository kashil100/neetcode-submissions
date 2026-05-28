class Solution {
    public int check(int[] weights, int k){
        int sum = 0, count = 0;
        for(int num:weights){
            if(num > k){
                return -1;
            }
            sum+=num;
            if(sum == k){
                count++;
                sum=0;
            }else if(sum > k){
                sum = num;
                count++;
            }
        }

        if(sum > 0){
            count++;
        }

        return count;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l = 1, r = 1000000000, ans = 1;
        while(l<=r){
            int k = l + (r-l)/2;
            int temp = check(weights, k);

            if(temp!= -1 && temp <= days){
                ans = k;
                r = k-1;
            }else{
                l = k+1;
            }
        }

        return ans;
    }
}