class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i<board.length;i++) {
            for (int j = 0; j< board[0].length;j++) {
                if (backtrack(i,j,word,board,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean backtrack(int i, int j, String word,char[][]board,int count){
        if (count == word.length()) return true;
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length 
        || board[i][j] != word.charAt(count) || board[i][j] == '#' )return false;
        board[i][j] = '#';
        boolean res = backtrack(i+1,j,word,board,count+1) || 
            backtrack(i,j+1,word,board,count+1) ||
            backtrack(i-1,j,word,board,count+1) ||
            backtrack(i,j-1,word,board,count+1);
        board[i][j] = word.charAt(count);
        return res;
    }
}
