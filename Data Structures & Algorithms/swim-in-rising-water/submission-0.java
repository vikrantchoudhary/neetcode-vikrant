class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        if (n <= 0) return 0;
        int[][] direction = {{-1,0},{1,0},{0,-1},{0,1}};
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            Comparator.comparingInt(a -> a[0])
        );
        //minHeap.offer(grid[0][0],0,0);
        minHeap.offer(new int [] {grid[0][0],0,0});
        boolean visited[][] = new boolean[n][n];
        while(!minHeap.isEmpty()) {
            int[]curNode = minHeap.poll();
            int t = curNode[0], r = curNode[1] , c = curNode[2];
            visited[r][c] = true;
            if (r == n -1 && c == n-1) return t;
            for (int[] dir : direction) {
                int ner = r + dir[0] , nec = c + dir[1];
                if (ner < 0 || nec < 0 ||ner >= n || nec >= n || visited[ner][nec] ) continue;
                minHeap.offer(new int[] {Math.max(t,grid[ner][nec]),ner,nec});
            }
        }
        return 0;
    }
}
