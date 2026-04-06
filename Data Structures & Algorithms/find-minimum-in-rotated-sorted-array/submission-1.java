class Solution {
    public int findMin(int[] nums) {
        int l =0;
        int r = nums.length -1;
        int res = Integer.MAX_VALUE ;

        while (l <= r) {
            int m = l + ( r - l)/2;
            if (nums[l] < nums[r]) {
                res = Math.min(res,nums[l]);
                break;
            }
            res = Math.min(res,nums[m]);
            if (nums[m] >= nums[l]) {
                l = m +1;
            }else {
                r = m -1;
            }
        }
        return res;
    }
}
