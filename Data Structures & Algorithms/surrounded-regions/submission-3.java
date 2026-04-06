class Solution {
    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        if (rows == 0) return;
        
        // Step 1: Mark all 'O's connected to the borders
        for (int i = 0; i < rows; i++) {
            dfs(i, 0, board);
            dfs(i, cols - 1, board);
        }
        for (int j = 0; j < cols; j++) {
            dfs(0, j, board);
            dfs(rows - 1, j, board);
        }

        // Step 2: Traverse the board, flip 'O' to 'X' and 'T' back to 'O'
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X';
                else if (board[i][j] == 'T') board[i][j] = 'O';
            }
        }
    }

    private void dfs(int r, int c, char[][] board) {
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length || board[r][c] != 'O') return;
        board[r][c] = 'T'; // Mark as temporary to indicate it's not surrounded
        dfs(r + 1, c, board);
        dfs(r - 1, c, board);
        dfs(r, c + 1, board);
        dfs(r, c - 1, board);
    }
}