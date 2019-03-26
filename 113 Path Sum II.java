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
    public List<List<Integer>> pathSum(TreeNode root, int sum){
        List<List<Integer>> result  = new LinkedList<List<Integer>>();
        List<Integer> currentResult  = new LinkedList<Integer>();
        helper(root, sum, currentResult, result);
        return result;
    }

    private void helper(TreeNode root, int sum, List<Integer> currentResult, List<List<Integer>> result) {
        if (root == null) return;
        currentResult.add(root.val);
        if (root.left == null && root.right == null && sum == root.val) {
            result.add(new inkedList(currentResult));
            currentResult.remove(currentResult.size() - 1);//don't forget to remove the last integer
            return;
        } else {
            helper(root.left, sum-root.val, currentResult, result);
            helper(root.right, sum-root.val, currentResult, result);
        }
        currentResult.remove(currentResult.size()-1);
    }
}