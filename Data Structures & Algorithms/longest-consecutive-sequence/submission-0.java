class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length < 1) return 0;
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        int maxSize = 0;
        int curNum,curMax;
        for (int n :  nums ) {
            if (!set.contains(n -1 )) {
                curNum = n;
                curMax = 1;
                while (set.contains(curNum+1)) {
                    curNum++;
                    curMax++;
                }
                maxSize = Math.max(curMax,maxSize);
            }
            
        }
        return maxSize;
        
    }
}
