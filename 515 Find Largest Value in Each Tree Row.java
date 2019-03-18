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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int queueSize = (root == null) ? 0 : 1;
        while(queueSize > 0){
            int max = Integer.MIN_VALUE;
            for(int i=0; i<queueSize; ++i){
                TreeNode cur = queue.poll();
                max = Math.max(max, cur.val);
                if(cur.left != null) queue.offer(cur.left);
                if(cur.right != null) queue.offer(cur.right);
            }
            res.add(max);
            queueSize = queue.size();
        }
        return res;
    }
}