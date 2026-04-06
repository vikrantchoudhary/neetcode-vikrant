class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        Set<String> result = new HashSet<>();
        int rows = board.length;
        int cols = board[0].length;
        boolean [][] isVisited = new boolean[rows][cols];
        TrieNode root = new TrieNode();
        for (String word : words) {
            root.addWord(word);
        }
        for (int r = 0 ; r < rows ; r++) {
            for (int c =0; c< cols; c++) {
                dfs(r,c,root,"",board,isVisited,result);
            }
        }
        return new ArrayList<>(result);
    }
    private void dfs(int r, int c, TrieNode node, String word,char[][]board,
    boolean [][] isVisited,Set<String> result) {
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length 
        || isVisited[r][c] || !node.children.containsKey(board[r][c])) return;
        isVisited[r][c] = true;
        node = node.children.get(board[r][c]);
        word += board[r][c];
        if (node.isWord) {
            result.add(word);
        }
        dfs(r - 1,c,node,word,board,isVisited,result);
        dfs(r + 1,c,node,word,board,isVisited,result);
        dfs(r ,c - 1,node,word,board,isVisited,result);
        dfs(r,c + 1,node,word,board,isVisited,result);
        isVisited[r][c] = false;
    }

}
class TrieNode {
    Map<Character,TrieNode> children;
    boolean isWord;
    public TrieNode(){
        children = new HashMap<>();
        isWord = false;
    }
    public void addWord(String word) {
        TrieNode curr = this;
        for (char c : word.toCharArray()) {
            curr.children.putIfAbsent(c,new TrieNode());
            curr = curr.children.get(c);
        }
        curr.isWord = true;
    }
}
