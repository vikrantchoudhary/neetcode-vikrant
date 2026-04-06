class Solution {
    public int findKthLargest(int[] nums, int k) {
        if (nums.length < k) return 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int n : nums) minHeap.offer(n);
        while (minHeap.size() > k) minHeap.poll();
        return minHeap.poll();
    }
}
