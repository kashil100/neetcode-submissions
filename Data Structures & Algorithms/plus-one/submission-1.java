class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1;
        int[] ans = new int[n+1];
        for(int i =n-1;i>=0;i--){
            int temp = (digits[i]+carry)/10;
            digits[i] = (digits[i]+carry)%10;
            carry = temp;
            ans[i+1] = digits[i];
            if(carry == 0){
                return digits;
            }
        }

        ans[0] = carry;
        return ans;
    }
}
