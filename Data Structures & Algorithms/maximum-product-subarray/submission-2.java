class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length <= 0) return 0;
        int res = nums[0];
        int maxV = 1;
        int minV = 1;
        for (int i = 0; i< nums.length;i++) {
            int vMax = maxV * nums[i];
            int vMin = minV * nums[i];
            minV = Math.min(nums[i], Math.min(vMax,vMin));
            maxV =  Math.max(nums[i], Math.max(vMin,vMax));
            res = Math.max (res,maxV);
        }
        return res;
    }
}
