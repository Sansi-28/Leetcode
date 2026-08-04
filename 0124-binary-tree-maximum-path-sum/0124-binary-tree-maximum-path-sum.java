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
    public int maxPathSum(TreeNode root) {
      max = Integer.MIN_VALUE;
        f(root);
        return max;
    }

    int f(TreeNode root){
      if(root == null)return 0;
      int prevL = f(root.left);
      int l = root.val + (( prevL< 0) ? 0 : prevL);
      int prevR = f(root.right);
      int r = root.val + ((prevR < 0) ? 0 : prevR);


     /* if(l < root.val){
        l = root.val;
      }
      if(r < root.val)*/
      max = Math.max(max, l + r - root.val);
      return Math.max(l, r);
    }
}