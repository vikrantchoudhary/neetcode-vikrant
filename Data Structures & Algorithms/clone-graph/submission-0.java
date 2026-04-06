/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        HashMap<Node,Node> hashMap = new HashMap<>();
        return DFS(node,hashMap);
    }
    public Node DFS(Node node,HashMap<Node,Node> map) {
        if (node == null) return null;
        if (map.containsKey(node)) {
            return map.get(node);
        }
        Node cloneNode = new Node(node.val);
        map.put(node,cloneNode);
        for (Node nd : node.neighbors) {
            cloneNode.neighbors.add(DFS(nd,map));
        }
        return cloneNode;
    }
}