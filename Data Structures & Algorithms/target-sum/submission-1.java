class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return backtrack(0, 0,nums,target);
    }
    private int backtrack(int i, int cur_sum, int [] nums, int target) {
        if (i == nums.length) return cur_sum == target ? 1:0;
        return (backtrack(i+1,cur_sum+nums[i],nums,target)
        + backtrack(i+1,cur_sum-nums[i],nums,target));

    }

}
