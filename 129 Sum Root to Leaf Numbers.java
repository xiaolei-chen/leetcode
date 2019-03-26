/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
 class Solution { //preorder 
    public int sumNumbers(TreeNode root) {
        if(root == null){
            return 0;
        }
        int sum = 0;
        TreeNode curr;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.empty()){
            curr = stack.pop();
            if(curr.right != null){
                curr.right.val = curr.val * 10 + curr.right.val;
                stack.push(curr.right);
            }
            if(curr.left != null){
                curr.left.val = curr.val * 10 + curr.left.val;
                stack.push(curr.left);
            } 
            if(curr.left == null && curr.right == null){ // leaf node
                    sum += curr.val;
            }
        }
        return sum;
    }
}
 
 /*
class Solution {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }
    private int dfs(TreeNode root, int sum){
        if(root == null) return 0;
        sum = sum * 10 + root.val;
        if(root.left == null && root.right == null){
            return sum;
        }
        return dfs(root.left, sum) + dfs(root.right, sum);
    }
}
*/