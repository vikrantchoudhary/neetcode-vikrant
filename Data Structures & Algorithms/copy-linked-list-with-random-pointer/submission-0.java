/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> oldNewMap = new HashMap<>();
        oldNewMap.put(null,null);
        Node cur = head;
        while (cur != null) {
            Node copy = new Node(cur.val);
            oldNewMap.put(cur,copy);
            cur = cur.next;
        }
        cur = head;
        while (cur != null) {
            Node copy = oldNewMap.get(cur);
            copy.next = oldNewMap.get(cur.next);
            copy.random = oldNewMap.get(cur.random);
            cur = cur.next;
        }
        return oldNewMap.get(head);
    }
}
