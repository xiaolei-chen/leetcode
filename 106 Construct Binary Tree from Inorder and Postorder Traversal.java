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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(postorder.length-1, inorder.length-1, 0, inorder, postorder);
    }

    private TreeNode helper(int postStart, int inStart, int inEnd, int[] inorder, int[] postorder) {
        if (postStart < 0 || inStart < inEnd) return null;

        //The last element in postorder is the root.
        TreeNode root = new TreeNode(postorder[postStart]);

        //find the index of the root from inorder. Iterating from the end.
        int rIndex = inStart;
        for (int i = inStart; i >= inEnd; i--) {
            if (inorder[i] == postorder[postStart]) {
                rIndex = i;
                break;
            }
        }
        //build right and left subtrees. Again, scanning from the end to find the sections.
        root.right = helper(postStart-1, inStart, rIndex+1, inorder, postorder);
        root.left = helper(postStart-(inStart-rIndex)-1, rIndex-1, inEnd, inorder, postorder);
        return root;
    }
}