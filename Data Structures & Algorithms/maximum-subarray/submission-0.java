class Solution {
    public int maxSubArray(int[] nums) {
        return dfs(0,nums,false);
    }
    private int dfs(int i, int[] nums, boolean flag) {
        if (i >= nums.length) return flag ?  0: Integer.MIN_VALUE;
        if (flag) {
            return Math.max (0, nums[i] + dfs(i+1,nums,true));
        }else {
            return Math.max(dfs(i+1,nums,false), nums[i]+dfs(i+1,nums,true));
        }
    }
}
