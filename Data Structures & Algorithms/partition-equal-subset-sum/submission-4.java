class Solution {
    boolean [][] cache;
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = Arrays.stream(nums).sum();
        if (sum %2 != 0 )return false;
        cache = new boolean[n][sum/2 + 1];
        return dfs(nums,0,sum/2);
    }
    private boolean dfs(int[] nums,int i, int target) {
        if (i == nums.length) return target == 0;
        if (target < 0) return false;
        if (cache[i][target]) return cache[i][target];
        cache[i][target] = dfs(nums,i+1,target) || dfs(nums,i+1,target-nums[i]);
        return cache[i][target];
    }
}
