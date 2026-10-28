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
  boolean flag;
    public boolean isBalanced(TreeNode root) {
      flag = true;

      f(root);
      return flag;
        
    }

    int f(TreeNode root){
      if(root == null)return 0;

      int l = 1 + f(root.left);
      int r = 1 + f(root.right);
      flag = flag&(Math.abs(r-l) <= 1);

      return Math.max(l, r);
        
      }

}