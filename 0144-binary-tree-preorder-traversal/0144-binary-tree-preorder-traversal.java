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
  List<Integer> ans;
    public List<Integer> preorderTraversal(TreeNode root) {
        ans = new  ArrayList<>();
        f(root);
        return ans;
    }

    void f(TreeNode root){
      if(root == null)return;
      ans.add(root.val);
      f(root.left);
      f(root.right);
    }
}