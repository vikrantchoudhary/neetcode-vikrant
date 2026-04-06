class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length < 1) return 0;
        int k =0;
        int result[] = new int[nums.length];
        for (int i = 0; i< nums.length; i++) {
            if (nums[i] != val) {
                result[k] = nums[i];
                k++;
            }
        }
        System.arraycopy(result, 0, nums, 0, k);
        
        return k;
    }
}