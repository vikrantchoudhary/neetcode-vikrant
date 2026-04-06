class Solution {
    public int minCostConnectPoints(int[][] points) {
        Map<Integer,List<int[]>> adjNodes = new HashMap<>();
        int n = points.length;
        for (int i =0 ; i< n;i++) {
            for (int j = i+1 ; j< n; j++){
                int dist = distance(points[i],points[j]);
                adjNodes.computeIfAbsent(i, k -> new ArrayList()).add(new int[] {dist,j});
                adjNodes.computeIfAbsent(j,k-> new ArrayList()).add(new int[] {dist,i});
            }
        }
        int result = 0;
        Set<Integer> visited = new HashSet<>();
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            Comparator.comparingInt(a -> a[0])
        );
        minHeap.offer(new int[] {0,0});
        while (visited.size() < n) {
            int[] curr = minHeap.poll();
            int cost = curr[0];
            int dest = curr[1];
            if (visited.contains(dest)) continue;
            result += cost;
            visited.add(dest);
            for (int[] pt : adjNodes.getOrDefault(dest, Collections.emptyList())){
                int ptCost = pt[0];
                int ptIndex = pt[1];
                if (!visited.contains(ptIndex))  minHeap.offer(new int [] {ptCost,ptIndex});

            }
        }
        return result;
    }
    private int distance(int[] x , int[] y) {
        return Math.abs(x[0]-y[0]) + Math.abs(x[1] - y[1]);
    }
}
