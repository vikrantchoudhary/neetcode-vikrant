class Solution {
    public int trap(int[] height) {
        if (height.length < 1) return 0;
        int left = 0,right = height.length -1;
        int leftMax =0, rightMax = 0;
        int result = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (leftMax < height[left]){
                    leftMax = height[left];
                }else {
                    result += leftMax - height[left];
                }
                left++;
            }else {
                if (rightMax < height[right]){
                    rightMax = height[right];
                }else {
                    result += rightMax - height[right];
                }
                right--;
            }
        }
        return result;
    }
}
