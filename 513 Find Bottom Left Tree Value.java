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
    private int h = 0;
    public int findBottomLeftValue(TreeNode root) {
        helper(root, 1);
        return res;
    }
    private void helper(TreeNode root, int depth){
        if(h < depth){
            res = root.val;
            h = depth;
        }
        if(root.left != null){
            helper(root.left, depth+1);
        }
        if(root.right != null){
            helper(root.right, depth+1);
        }
    }
}

/*
class Solution { //≤ªµ›πÈ
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            root = queue.poll();
            if(root.right != null){ //œ»”“∫Û◊Û
                queue.offer(root.right);
            }
            if(root.left != null){
                queue.offer(root.left);
            }
        }
        return root.val;
    }
}
*/