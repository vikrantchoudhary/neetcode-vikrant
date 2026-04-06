class Solution {
    public boolean validTree(int n, int[][] edges) {
        if (edges.length > n -1) return false;
        List<List<Integer>> adjNodes = new ArrayList<>();
        for (int i = 0 ; i< n ; i++) {
            adjNodes.add(new ArrayList<>());
        }
        for (int [] edge : edges) {
            adjNodes.get(edge[0]).add(edge[1]);
            adjNodes.get(edge[1]).add(edge[0]);
        }
        Set<Integer> visit = new HashSet<>();
        if (!dfs(0,-1,visit,adjNodes)) return false;
        return visit.size() == n;
    }
    private boolean dfs(int node,int prevNode, Set<Integer> visit, List<List<Integer>> adjNodes) {
        if (visit.contains(node)) return false;
        visit.add(node);
        for (int nd : adjNodes.get(node)) {
            if (nd == prevNode) continue;
            if (!dfs(nd,node,visit,adjNodes)) return false;
        }
        return true;
    }
}
