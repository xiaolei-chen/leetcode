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
            newroot.left = d == 1 ? root : null;  //如果d为1，将root连到新结点的左子结点上
            newroot.right = d == 0 ? root : null; //如果d为0，将root连到新结点的右子结点上
            return newroot;
        }
        if (root != null && d >= 2) {
            root.left  = addOneRow(root.left,  v, (d > 2) ? d - 1 : 1);
            root.right = addOneRow(root.right, v, (d > 2) ? d - 1 : 0);
        }
        return root;
    }
}