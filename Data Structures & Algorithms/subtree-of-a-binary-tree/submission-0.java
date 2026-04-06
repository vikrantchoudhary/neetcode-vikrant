/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode q = queue.poll();
            if (isSame(q,subRoot)) return true;
            if (q.left != null) queue.offer(q.left);
            if (q.right != null) queue.offer(q.right);
        }
        return false;

    }
    public boolean isSame(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if ((p == null && q != null) || (p != null && q == null)) return false;
        if (p.val != q.val) return false;
        return isSame(p.left,q.left) && isSame(p.right,q.right);
    }
}
