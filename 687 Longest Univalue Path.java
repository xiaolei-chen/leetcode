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
    private int res = 0;
    public int longestUnivaluePath(TreeNode root) {
        helper(root);
        return res;
    }
    private int helper(TreeNode root){
        if(root == null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        left = (root.left!=null && root.val==root.left.val) ? left+1 : 0;
        right = (root.right!=null && root.val==root.right.val) ? right+1 : 0;
        res = Math.max(left+right, res);
        return Math.max(left, right);
    }
}