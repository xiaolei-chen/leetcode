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
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (d == 0 || d == 1) {
            TreeNode newroot = new TreeNode(v);
            newroot.left = d == 1 ? root : null;  //���dΪ1����root�����½������ӽ����
            newroot.right = d == 0 ? root : null; //���dΪ0����root�����½������ӽ����
            return newroot;
        }
        if (root != null && d >= 2) {
            root.left  = addOneRow(root.left,  v, (d > 2) ? d - 1 : 1);
            root.right = addOneRow(root.right, v, (d > 2) ? d - 1 : 0);
        }
        return root;
    }
}