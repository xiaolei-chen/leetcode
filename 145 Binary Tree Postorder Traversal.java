/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution { //×ó-ÓÒ-¸ù
    private List<Integer> res = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        helper(root);
        return res;
    }
    private void helper(TreeNode root){
         if(root == null) return;
         res.add(0, root.val);
         if(root.right != null) helper(root.right);
         if(root.left != null) helper(root.left);
         
     }
}