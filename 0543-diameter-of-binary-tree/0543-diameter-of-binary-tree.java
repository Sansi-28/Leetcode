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
  int max;
    public int diameterOfBinaryTree(TreeNode root) {
        max = 0;
        f(root);
        return max;
    }

    int f(TreeNode root){
      if(root == null)return 0;

      int l = 1 + f(root.left);
      int r = 1 + f(root.right);
      max = Math.max(max, l + r - 2);
      return Math.max(l, r);
    }
}