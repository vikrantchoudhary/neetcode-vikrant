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
    public boolean isValidBST(TreeNode root) {
        return validate(root,null,null);
    }
    private boolean validate(TreeNode root,Integer low, Integer high) {
        if (root == null) return true;
        int val = root.val;
        if (low != null && val <= low) return false;
        if (high != null && val >= high) return false;
        if (!validate(root.left, low,val)) return false;
        if (!validate(root.right, val,high)) return false;
        return true;

    }
}
