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
    List<Integer> result = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {

        if (root == null) return result;
        dfs(root,0);
        return result;
    }
    public void dfs (TreeNode tree,int depth) {
        if (tree == null) return;
        if (result.size() == depth) result.add(tree.val);
        dfs(tree.right,depth+1);
        dfs(tree.left,depth+1);
    }
}
