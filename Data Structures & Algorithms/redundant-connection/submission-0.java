class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        List<List<Integer>> adjNodes = new ArrayList<>();
        int n = edges.length;
        int [] indegree = new int[n+1];
        for (int i =0 ;i <= n;i++) {
            adjNodes.add(i,new ArrayList<>());
        }
        for (int [] edge : edges) {
            int u = edge[0], v = edge[1];
            adjNodes.get(u).add(v);
            adjNodes.get(v).add(u);
            indegree[u]++;
            indegree[v]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i<=n ; i++) {
            if (indegree[i] == 1) queue.offer(i);
        }
        while (!queue.isEmpty()) {
            int node = queue.poll();
            indegree[node]--;
            for (int edge : adjNodes.get(node)) {
                indegree[edge]--;
                if (indegree[edge] == 1) queue.offer(edge);
            }
        }
        for (int i = n-1; i>=0 ; i--) {
            int u = edges[i][0], v = edges[i][1];
            if (indegree[u] == 2 && indegree[v] >0) return new int[] {u,v};
        }
        return new int[0];
    }
}
