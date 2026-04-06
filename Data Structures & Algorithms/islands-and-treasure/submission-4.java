class Solution {

    private int INF = 2147483647;
    private boolean[][] visited;
    private int [][] direction = {{1,0},{-1,0},{0,-1},{0,1}};
    int rows,cols;
    public void islandsAndTreasure(int[][] grid) {

        rows = grid.length;
        cols = grid[0].length;
        visited = new boolean[rows][cols];
        for (int i = 0 ;i < rows ; i++) {
            for (int j = 0; j< cols; j++) {
                if (grid[i][j] == INF) {
                    //grid[i][j] = dfs(grid,i,j);
                    grid[i][j] = bfs(grid,i,j);
                }
            }
        }
    }
    /*private int dfs(int[][] grid, int r, int c ) {
        if (r < 0 || c < 0 || r >= rows|| c >= cols
        || grid[r][c] == -1 || visited[r][c]) return INF;
        if (grid[r][c] == 0) return 0;
        visited[r][c] = true;
        int res = INF;
        for (int [] dir : direction) {
            int cur = dfs(grid,r + dir[0] , c + dir[1]);
            if (cur != INF) res = Math.min(res,1+cur);
        }
        
        visited[r][c] = false;
        return res;
    }*/
    private int bfs(int[][] grid,int r, int c) {
        Deque<int[]> queue = new LinkedList<>();
        queue.add(new int[] {r,c});
        boolean [][]visited = new boolean[rows][cols];
        int steps = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i =0 ; i < size; i++) {
                int [] curr = queue.poll();
                int row = curr[0], col = curr[1];
                if (grid[row][col] == 0) return steps;
                for (int [] dir : direction) {
                    int nr = row +dir[0], nc = col + dir[1];
                    if (nr >=0 && nr < rows && nc >=0 && nc < cols 
                    && !visited[nr][nc] && grid[nr][nc] != -1){
                        visited[nr][nc] = true;
                        queue.add(new int[] {nr,nc});
                    }
                }
            }
            steps++;
            
        }
        
        return INF;
    }

    

}
