class Solution {
    int dp[][];
    int directions[][] = {{-1,0},{1,0},{0,-1},{0,1}};
    public int longestIncreasingPath(int[][] matrix) {
        dp = new int [matrix.length][matrix[0].length];
        for (int i = 0 ; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length;j++) {
                dp[i][j] = -1;
            }
        }
        
        int result = 0;
        for (int i = 0 ; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length;j++) {
                result = Math.max(result,dfs(i,j,Integer.MIN_VALUE,matrix));
            }
        }
        
        return result;
    }
    private int dfs(int r, int c, int prev_value, int[][] matrix) {
        if (r < 0 || c < 0 || r >= matrix.length || c >= matrix[0].length || matrix[r][c] <= prev_value)
            return 0;
        if (dp[r][c] != -1) return dp[r][c];
        int result = 1;

        for (int dir[] : directions){
            result = Math.max(result,1+dfs(r+dir[0],c+ dir[1],matrix[r][c],matrix));
        }
        dp[r][c] = result;
        return result;
    }
}
