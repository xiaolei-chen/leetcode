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
    public List<Integer> inorderTraversal(TreeNode root) {
        helper(root);
        return res;
    }
     private void helper(TreeNode root){
         if(root == null) return;
         if(root.left != null) helper(root.left);
         res.add(root.val);
         if(root.right != null) helper(root.right);
     }
}