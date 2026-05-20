class Solution {
    public boolean[][] mp;
    public int dfs(int[][] grid, int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j] == 0){
            return 1;
        }

        if(mp[i][j]){
            return 0;
        }
        mp[i][j] = true;

        return dfs(grid,i+1,j) + dfs(grid,i,j+1) + dfs(grid,i-1,j) + dfs(grid,i,j-1);
    }
    public int islandPerimeter(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        mp = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1){
                    return dfs(grid,i,j);
                }
            }
        }

        return 0;
        
    }
}