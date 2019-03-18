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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null) return false;
        if(isSame(s, t)) return true;
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }
     private boolean isSame(TreeNode p, TreeNode q){
         if(p==null && q==null) return true;
         if(p==null || q==null) return false;
         if(p.val != q.val) return false;
         return isSame(p.left, q.left) && isSame(p.right, q.right);
     }
}