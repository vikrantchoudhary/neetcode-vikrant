class Solution {
    public int majorityElement(int[] nums) {
        int curMax = 0, count =0;
        for (int n : nums) {
            if (count == 0){
                curMax = n;
            }
            count += (n == curMax)?1 : -1;

        }
        return curMax;
    }
}