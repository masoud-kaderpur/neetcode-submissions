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
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;

        invertRecursive(root);

        return root;
    }

    public void invertRecursive(TreeNode root) {
        if (root == null)
            return;
        TreeNode right = root.right;
        TreeNode left = root.left;

        root.right = left;
        root.left = right;

        invertRecursive(root.right);
        invertRecursive(root.left);
    }
}
