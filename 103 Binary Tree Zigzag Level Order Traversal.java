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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        travel(root, res, 0);
        return res;
    }
    
    private void travel(TreeNode root, List<List<Integer>> res, int level){
        if(root == null) return;
        
        if(res.size() <= level){
            List<Integer> newLevel = new ArrayList<>();
            res.add(newLevel);
        }
        
        List<Integer> collection  = res.get(level);
        if(level % 2 == 0){
            collection.add(root.val);
        }else{
            collection.add(0, root.val);
        }
        
        travel(root.left, res, level + 1);
        travel(root.right, res, level + 1);
    }
}