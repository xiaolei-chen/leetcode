/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
 
 /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
// Ñ­»·
public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        int curSum = 0;
        TreeNode cur = root;
        TreeNode pre = null;
        while(cur!=null || !stack.isEmpty()){
            while(cur!=null){
                stack.push(cur);
                list.add(cur.val);
                curSum += cur.val;
                cur=cur.left;
            }
            cur = stack.peek();
            if(cur.right!=null && cur.right!=pre){
                cur = cur.right;
                continue;
            } 
            if(cur.left == null && cur.right == null && curSum == sum){
                res.add(new ArrayList<Integer>(list));
            }
            pre = cur;
            stack.pop();
            list.remove(list.size()-1);
            curSum -= cur.val;
            cur = null;
        }
        return res;
    }
}
 
// µÝ¹é
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
