class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adjNodes = new ArrayList<>();
        for (int i = 0 ;i < n; i++) {
            adjNodes.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adjNodes.get(edge[0]).add(edge[1]);
             adjNodes.get(edge[1]).add(edge[0]);
        }
        boolean[] visited = new boolean[n];
        int count = 0;
        for (int i =0 ;i < n; i++) {
            if (!visited[i]) {
                dfs(adjNodes,visited,i);
                count ++ ;
            }
        }
        return count;
    }
    private void dfs(List<List<Integer>> adjNodes, boolean[] visisted, int node) {
        //if (visisted[node]) return;
        visisted[node] = true;
        for (int nd : adjNodes.get(node)){
            if (visisted[nd]) continue;
            dfs(adjNodes,visisted,nd);
        }
    }
}
