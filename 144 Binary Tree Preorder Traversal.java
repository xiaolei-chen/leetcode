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
    private List<Integer> res = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        helper(root);
        return res;
    }
     private void helper(TreeNode root){
         if(root == null) return;
         res.add(root.val);
         if(root.left != null) helper(root.left);
         if(root.right != null) helper(root.right);
     }
}