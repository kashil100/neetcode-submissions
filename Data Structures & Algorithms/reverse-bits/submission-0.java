class Solution {
    public int reverseBits(int n) {
        int[] temp = new int[32];
        Arrays.fill(temp, 0);
        for(int i = 0;i < 32;i++){
            if(((n>>i)&1) == 1){
                temp[i] = 1;
            }
        }

        n = 0;
        for(int i = 0;i<32;i++){
            n = (n<<1)|temp[i];
        }

        return n;
        
    }
}
