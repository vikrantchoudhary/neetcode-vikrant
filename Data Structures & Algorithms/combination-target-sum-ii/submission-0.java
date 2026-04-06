class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(candidates);
        backtracking(candidates,target,0,0,cur,result);
        return result;
    }
    private void backtracking(int[] nums,int target,int total, int start,List<Integer> current,List<List<Integer>> result){
        if (target == total) {
            result.add(new ArrayList(current));
            return;
        }
        if (total > target || start >= nums.length) return;
        for (int i = start; i< nums.length ; i++ ) {
            if (target < total + nums[i]) break;
            if (i > start && nums[i] == nums[i - 1]) continue;
            current.add(nums[i]);
            backtracking(nums,target,total + nums[i],i+1,current,result);
            current.remove(current.size() - 1);
        }
    }
}
