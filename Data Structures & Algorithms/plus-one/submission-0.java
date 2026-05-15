class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1;
        for(int i =n-1;i>=0;i--){
            int temp = (digits[i]+carry)/10;
            digits[i] = (digits[i]+carry)%10;
            carry = temp;
            if(carry == 0){
                return digits;
            }
        }

        int[] ans = new int[n+1];
        ans[0] = carry;
        for(int i =0;i<n;i++){
            ans[i+1] = digits[i];
        }

        return ans;
    }
}
