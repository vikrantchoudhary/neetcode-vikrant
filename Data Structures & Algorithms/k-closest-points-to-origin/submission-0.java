class Solution {
    public int[][] kClosest(int[][] points, int k) {
    PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> Integer.compare(distance(b),distance(a)));
    for (int[] point: points) {
        queue.offer(point);
        if (queue.size() > k) queue.poll();
    }
    int[][] result = new int [k][2];
    for (int i= 0; i< k; i++) {
        result[i] = queue.poll(); 
    }
    return result;

    }
    public int distance (int[] a) {
        return ((a[0] * a[0]) + (a[1] * a[1]));
    }
    
}
