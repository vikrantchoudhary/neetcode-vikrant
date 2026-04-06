class Solution {
     List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0,nums,cur);
        return result;
    }
    private void backtrack(int i, int[] nums,List<Integer> cur){
        result.add(new ArrayList<> (cur));
        for (int j = i; j< nums.length;j++) {
            if (j > i && nums[j] == nums[j -1]) continue;
            cur.add(nums[j]);
            backtrack(j+1,nums,cur);
            cur.remove(cur.size() -1);
        }
        
    }
}
