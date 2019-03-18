/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution { //分析Example 2，p和q同时位于左子树
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q)  return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q); //left会返回p和q中较高的那个位置，所以最终返回非空的left即可
        TreeNode right = lowestCommonAncestor(root.right, p, q); //right会返回null
        if(left != null && right != null){ //还有一种情况是会返回p和q的最小父结点
            return root;
        }
        return left != null ? left : right;
    }
}