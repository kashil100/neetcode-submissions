class Solution {
    public int maxArea(int[] heights) {
        int ans = 0;
        int j = heights.length-1;
        int i = 0;
        while(i<j){
            int x = Math.min(heights[i], heights[j]);
            int y = j-i;
            ans = Math.max(ans, x*y);
            if(heights[i] < heights[j]){
                i++;
            }else{
                j--;
            }
        }

        return ans;
    }
}
