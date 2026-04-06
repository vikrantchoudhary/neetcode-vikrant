class MedianFinder {
    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;
    public MedianFinder() {
        minHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if (minHeap.isEmpty() || num < minHeap.peek()) {
            minHeap.offer(num);
        }else {
            maxHeap.offer(num);
        }
        //balance the tree
        if (minHeap.size() > (maxHeap.size() + 1)) {
            maxHeap.offer(minHeap.poll());
        }else if (minHeap.size() < maxHeap.size()) {
            minHeap.offer(maxHeap.poll());
        }
    }
    
    public double findMedian() {
        if (minHeap.size() > maxHeap.size()) {
            return minHeap.peek();
        }
        return (minHeap.peek() + maxHeap.peek())/2.0;
    }
}
