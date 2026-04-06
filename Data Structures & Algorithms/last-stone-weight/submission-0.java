class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> (b-a));
        for (int stone : stones) {
            maxHeap.offer(stone);
        }
        while(maxHeap.size() > 1) {
            int fStone = maxHeap.poll();
            int sStone= maxHeap.poll();
            if (fStone > sStone) {
                maxHeap.offer(fStone - sStone);
            }
        }
        maxHeap.offer(0);
        return maxHeap.peek();
    }
}
