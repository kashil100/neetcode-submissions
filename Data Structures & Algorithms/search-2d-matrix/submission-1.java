class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int i = 0, j = m-1;
        while(i<=j){
            int k = i + (j - i)/2;
            if(matrix[k][0] == target){
                return true;
            }else if(matrix[k][0] > target){
                j = k-1;
            }else{
                int l = 0, r = n-1;
                while(l<=r){
                    int mid = l + (r-l)/2;
                    if(matrix[k][mid] == target){
                        return true;
                    }else if(matrix[k][mid] < target){
                        l = mid + 1;
                    }else{
                        r = mid - 1;
                    }
                }
                i = k + 1;
            }
        }

        return false;
    }
}
