class Solution {
    int[][] dp;
    public int numDistinct(String s, String t) {
        int m = s.length(), n = t.length();
        if ( m < n) return 0;
        dp = new int [m+1][n+1];
        for (int i =0 ; i <= m ; i++) {
            Arrays.fill(dp[i],-1);
        }
        return dfs(0,0,s,t);
    }
    private int dfs(int i, int j, String s, String t) {
        if (j == t.length()) return 1;
        if (i == s.length()) return 0;
        if (dp[i][j] != -1) return dp[i][j];
        int res = dfs(i+1,j,s,t);
        if (s.charAt(i) == t.charAt(j)) {
            res += dfs(i+1,j+1,s,t);
        }
        dp[i][j] =res;
        return res;
    }
}
