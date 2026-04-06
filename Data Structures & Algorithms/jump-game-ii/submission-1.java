class Solution {
    int memo[];
    public int jump(int[] nums) {
        memo = new int[nums.length];
        Arrays.fill(memo,-1);
        return dfs(nums,0);
    }
    private int dfs(int[] nums, int i) {
        if (i == (nums.length -1) || nums.length == 0) return 0;
        if (memo[i] != -1) return memo[i];
        if (nums[i] == 0) {
            return 10000000;
        }
        
        int res = 10000000;
        int end = Math.min(nums.length - 1, i + nums[i]);
        for (int j = i + 1; j <= end;j++){
            res = Math.min(res,1 + dfs(nums,j));
        }
        memo[i] = res;
        return res;
    }
}
