class Solution {
    int [] cacheArray ;
    public int climbStairs(int n) {
        cacheArray = new int[n];
        for (int i =0; i<n;i++) {
            cacheArray[i] = -1;
        }
        int sol = dfs(n,0);
        return sol;
    }
    public int dfs(int n, int i) {
        if (i >= n) return i ==n ? 1:0;
        if (cacheArray[i] != -1) return cacheArray[i];
        return cacheArray[i] = dfs(n,i+1) + dfs(n,i+2);
    }
}
