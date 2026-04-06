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
    public int goodNodes(TreeNode root) {
        return dfs(root,root.val);
    }
    public int  dfs(TreeNode tree, int maxValue) {
        if (tree == null) return 0;
        int result = (tree.val >= maxValue) ? 1 : 0;
        maxValue = Math.max(tree.val, maxValue);
        result += dfs(tree.left,maxValue);
        result += dfs(tree.right,maxValue);
        return result;
    }
}
