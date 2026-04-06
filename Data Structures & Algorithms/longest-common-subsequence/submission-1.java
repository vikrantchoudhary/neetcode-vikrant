class Solution {
    int cache[][];
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        cache = new int[n][m];
        Arrays.stream(cache).forEach(row -> Arrays.fill(row,-1));
        return dfs(text1,text2,0,0);
    }
    private int dfs(String text1,String text2, int i, int j) {

        if ( i== text1.length() || j == text2.length()) return 0;
        if (cache[i][j] != -1) return cache[i][j];
        if (text1.charAt(i) == text2.charAt(j)) {
            cache[i][j] = 1+ dfs(text1,text2,i+1,j+1);
        }else {
            cache[i][j] = Math.max(dfs(text1,text2,i+1,j), dfs(text1,text2,i,j+1));
        }
        
        return cache[i][j];
    }
}
