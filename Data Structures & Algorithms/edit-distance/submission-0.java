class Solution {
    int [][] dp;
    public int minDistance(String word1, String word2) {
        int n = word1.length() , m = word2.length();
        dp = new int[n][m];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j<m; j++) {
                dp[i][j] = -1;
            }
        }
        return dfs(0,0,word1,word2);
    }
    private int dfs(int i, int j, String words1, String words2) {
        int n = words1.length(), m = words2.length();
        if (i == n) return m - j;
        if (j == m) return n -i;
        if (dp[i][j] != -1) return dp[i][j];
        if (words1.charAt(i) == words2.charAt(j)) {
            dp[i][j] = dfs(i+1,j+1,words1,words2);
        }else {
            int res = Math.min(dfs(i+1,j,words1,words2),dfs(i,j+1,words1,words2));
            res = Math.min(res,dfs(i+1,j+1,words1,words2));
            dp[i][j] = res+1;
        }
        return dp[i][j];
    }
}
