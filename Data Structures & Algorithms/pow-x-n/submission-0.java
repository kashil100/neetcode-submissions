class Solution {
    public double myPow(double x, int n) {
        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }else if(n == 1){
            return x;
        }
        boolean say = false;

        if(n < 0){
            say = true;
            n = Math.abs(n);
        }

        double temp = 1;
        for(int i=0;i<n;i++){
            temp = temp*x;
        }

        if(say){
            temp = (double)1/temp;
        }

        return temp;
    }
}
