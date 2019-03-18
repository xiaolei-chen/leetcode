/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution { //����Example 2��p��qͬʱλ��������
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q)  return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q); //left�᷵��p��q�нϸߵ��Ǹ�λ�ã��������շ��طǿյ�left����
        TreeNode right = lowestCommonAncestor(root.right, p, q); //right�᷵��null
        if(left != null && right != null){ //����һ������ǻ᷵��p��q����С�����
            return root;
        }
        return left != null ? left : right;
    }
}