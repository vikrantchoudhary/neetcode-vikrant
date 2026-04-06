class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (k <= 0 || nums.length == 0) return nums;
        int resSize = nums.length - k +1 ;
        int res[] = new int[resSize];
        for (int i = 0 ; i<= nums.length -k ;i++) {
            int max = nums[i];
            for (int j = i ; j<i+k;j++) {
                if (max < nums[j]) max = nums[j];
            }
            res[i] = max;
            //System.out.println(res[i]);
        }
        return res;
    }
}
