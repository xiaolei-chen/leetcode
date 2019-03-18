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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(Math.abs(getDepth(root.left) - getDepth(root.right)) > 1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
    
    private int getDepth(TreeNode root){
        if(root == null) return 0;
        return Math.max(getDepth(root.left), getDepth(root.right)) + 1;
    }
}

/*
class Solution { //ธüบร
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return height(root) != -1;
    }
    public int height(TreeNode node){
        if(node == null) return 0;
        
        int lH = height(node.left);
        if(lH == -1) return -1;
        
        int rH = height(node.right);
        if(rH == -1) return -1;
        
        if(lH - rH < -1 || lH - rH > 1) return -1;
        
        return Math.max(lH,rH)+1;
    }
}
*/