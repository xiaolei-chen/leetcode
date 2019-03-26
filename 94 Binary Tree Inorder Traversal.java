/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
class Solution {//����
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode p = root;
        while(!stack.isEmpty() || p != null) {
            if(p != null) {
                stack.push(p);
                p = p.left;
            } else {
                TreeNode node = stack.pop();
                result.add(node.val);  // Add after all left children
                p = node.right;   
            }
        }
        return result;
    }
}
 
 
class Solution { //�ݹ�
    private List<Integer> res = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        helper(root);
        return res;
    }
     private void helper(TreeNode root){
         if(root == null){
             return;
         }
         if(root.left != null){
             helper(root.left);
         }
         res.add(root.val);
         if(root.right != null){
             helper(root.right);
         }
     }
}