class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int p : nums) {
            res ^= p;
        }
        return res;
    }
}
