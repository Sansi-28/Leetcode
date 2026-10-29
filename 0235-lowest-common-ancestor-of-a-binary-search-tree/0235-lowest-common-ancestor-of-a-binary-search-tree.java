/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode ans;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ans = null;
        ArrayList<TreeNode> path1 = new ArrayList<>();
        ArrayList<TreeNode> path2 = new ArrayList<>();

        f(root, p, path1);
        f(root, q, path2);
        int len = path1.size() > path2.size() ? path2.size():path1.size();
        for(int i = 0; i < len; i++){
            if(path1.get(i).val == path2.get(i).val){
                ans = path1.get(i);
            }
        }
        return ans;
    }

    private boolean f(TreeNode root, TreeNode p, ArrayList<TreeNode> list){
        if(root == null )return false;
        
        list.add(root);
        if(root.val == p.val){
            return true;
        }

        if(f(root.left, p, list) || f(root.right, p, list)){
            return true;
        }
        list.remove(list.size()-1);
        return false;
    }
}