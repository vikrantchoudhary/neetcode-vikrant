class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> results = new ArrayList<>();
        backtrack(nums,target,0,new ArrayList<>(),results);
        return results;
    }
    public void backtrack(int[] nums,int target,int start, List<Integer> current,List<List<Integer>> results) {
        if (target == 0) {
            results.add(new ArrayList<>(current));
        }
        if (target < 0) {
            return;
        }
        for (int i = start; i < nums.length;i++) {
            current.add(nums[i]);
            backtrack(nums,target - nums[i],i,current,results);
            current.remove(current.size() -1);
        }
    }
}
