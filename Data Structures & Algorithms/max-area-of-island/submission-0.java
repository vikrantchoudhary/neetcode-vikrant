class Solution {
    
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        if (rows <=0 || cols <= 0 ) return 0;
        int max_area = 0;
        for (int i = 0 ; i< rows; i++){
            int area = 0;
            for (int j=0; j< cols;j++) {
                if (grid[i][j] == 1) {
                    max_area = Math.max(max_area,dfs(i,j,grid));
                }
                
            }
            
        }
        return max_area;
    }
    public int  dfs(int i, int j, int [][] grid ) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length  
            || grid[i][j] != 1) return 0;
        grid[i][j] = 0;
        int res = 1;
        
        res += dfs(i-1, j, grid);
        res += dfs(i, j-1, grid);
        res +=dfs(i+1, j, grid);
        res +=dfs(i, j+1, grid);
        return res;
        
    }
}
