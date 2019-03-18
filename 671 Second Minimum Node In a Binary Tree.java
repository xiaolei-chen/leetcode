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
     public int findSecondMinimumValue(TreeNode root){ //根结点一定是最小的结点值
        if(root.left == null) return -1; //左右必须同时存在
        int left  = (root.left.val  == root.val) ? findSecondMinimumValue(root.left)  : root.left.val;
        int right = (root.right.val == root.val) ? findSecondMinimumValue(root.right) : root.right.val;
        if(left  == -1) return right;
        if(right == -1) return left;
        return Math.min(left, right);
    }
}

/*
       2
      / \
     2   2
    / \ / \
   2  3 2  5
*/