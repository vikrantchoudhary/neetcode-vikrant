class Solution {
    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return -1;
        int rows = grid.length, cols = grid[0].length;
        
        int mins = 0;
        boolean status;
        do {
            status = false;
            boolean [][] toRot = new boolean[rows][cols];
            for (int i = 0; i<rows;i++) {
                for (int j =0; j< cols; j++) {
                    if (grid[i][j] == 2) {
                        if (i > 0 && grid[i-1][j] == 1) toRot[i-1][j] = true;
                        if (j > 0 && grid[i][j - 1] == 1) toRot[i][j-1] = true;
                        if (i < (rows - 1) && grid[i+1][j] == 1) toRot[i+1][j] = true;
                        if (j < (cols - 1) && grid[i][j+1] == 1) toRot[i][j+1] = true;
                    }
                }
            }
            for (int i = 0; i< rows ;i++) {
                for (int j =0; j< cols; j++) {
                    if (toRot[i][j]) {
                        grid[i][j] =2;
                        status = true;
                    }
                }
            }
            if (status) mins++;
        }while (status);
        for (int i = 0 ; i < rows ; i++) {
            for (int j =0; j< cols; j++) {
                if (grid[i][j] == 1) return -1;
            }
        }
        return mins;

    }
}
