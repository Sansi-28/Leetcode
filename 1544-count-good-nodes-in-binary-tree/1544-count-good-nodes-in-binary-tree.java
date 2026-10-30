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
    int ans;
    public int goodNodes(TreeNode root) {
        ans = 0;
        f(root, Integer.MIN_VALUE);
        return ans;
    }

    void f(TreeNode root, int max){
        if(root == null)return;
        if(max <= root.val){
            max = root.val;
            ans++;
        }
        // int newMax  = Math.max(max, root.value);
        f(root.left, max);
        f(root.right, max);
    }
}