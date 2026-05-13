class NumMatrix {
    int[][] temp;

    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        temp = new int[m][n+1];
        for(int i = 0;i<m;i++){
            for(int j =0 ;j<n;j++){
                temp[i][j+1] = temp[i][j] + matrix[i][j];
            }
        }
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        col2++;row2++;
        while(row1 < row2){
            sum = sum + temp[row1][col2] - temp[row1][col1];
            row1++;
        }

        return sum;

    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */