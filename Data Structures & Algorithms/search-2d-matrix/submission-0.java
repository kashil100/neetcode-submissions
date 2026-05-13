class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length;
        int m = matrix.length;
        int l=0, r =m*n-1;

        while(l<=r){
            int mid = l + (r-l)/2;
            int temp = matrix[mid/n][mid%n];

            if(temp==target){
                return true;
            }else if(temp > target){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        
        return false;
    }
}
