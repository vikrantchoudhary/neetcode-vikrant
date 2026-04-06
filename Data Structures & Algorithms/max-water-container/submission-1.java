class Solution {
    public int maxArea(int[] heights) {
        int left = 0 ,right = heights.length -1;
        int maxArea = Integer.MIN_VALUE;
        while (left < right) {
            int currentArea = Math.min(heights[left],heights[right]) * (right - left);
            maxArea = Math.max(maxArea,currentArea);
            if (heights[left] < heights[right]) {
                left ++;
            }else {
                right--;
            }

        }
        return maxArea;
    }
}
