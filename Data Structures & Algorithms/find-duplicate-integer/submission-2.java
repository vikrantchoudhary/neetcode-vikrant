class Solution {
    //LinkedList cycle
    //Floyd algorithm
    public int findDuplicate(int[] nums) {
        for (int num : nums) {
            int id = Math.abs(num) - 1;
            if (nums[id] < 0) return Math.abs(num);
            nums[id] *= -1;
        }
        return -1;
    }
}
