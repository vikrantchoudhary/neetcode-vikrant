class Solution {
    int dp[][];
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] nums_n = new int[n+2];
        nums_n[0] = 1;
        nums_n[n+1] = 1;

        for (int i = 0; i< n ; i++) {
            nums_n[i+1] = nums[i];
        }
        dp = new int[n+2][n+2];
        //dp[0] = -1, dp[n+1] = -1;
        for (int i = 0 ; i< n+1;i++) {
            for (int j = 0 ; j< n+1;j++){
                dp[i][j] = -1;
            }
        } 
        return dfs(nums_n,1,n);
    }
    private int dfs(int[] nums_n, int l , int r) {
        if (l > r) return 0;
        if (dp[l][r] != -1) return dp[l][r];
        dp[l][r] = 0;
        for (int i = l; i <= r; i++) {
            int coins = nums_n[l-1] * nums_n[i] * nums_n[r+1];
            coins += dfs(nums_n,l,i-1) + dfs(nums_n,i+1,r);
            dp[l][r] = Math.max(dp[l][r], coins);
        }
        return dp[l][r];
    }
}
