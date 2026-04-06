class Solution {
    boolean[][] pacific,atlantic;
    int rows,cols;
    int[][] direction = {{-1,0},{0,1},{1,0},{0,-1}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        rows = heights.length;
        cols = heights[0].length;
        List<List<Integer>> result = new ArrayList<>();
        pacific = new boolean[rows][cols];
        atlantic = new boolean[rows][cols];
        for (int r = 0; r < rows;r++) {
            dfs(r,0,pacific,heights);
            dfs(r,cols-1,atlantic,heights);
        }
        for (int c = 0; c < cols;c++) {
            dfs(0,c,pacific,heights);
            dfs(rows-1,c,atlantic,heights);
        }
        for (int i =0 ;i<rows; i++) {
            for (int j = 0 ; j< cols; j++) {
                if (pacific[i][j] && atlantic[i][j]) result.add(Arrays.asList(i,j));
            }
        }

        return result;
        
    }
    private void dfs(int r,int c, boolean[][] ocean,int[][] heights) {
        ocean[r][c] = true;
        for (int[] dir : direction) {
            int nr = r + dir[0],nc = c + dir[1];
            if (nr < 0 || nc < 0 || nr >= rows || nc >= cols || ocean[nr][nc] 
            || heights[nr][nc] < heights[r][c]) continue;
            dfs(nr,nc,ocean,heights);
        }
        //ocean[r][c] = false;
    }
    
   
}
