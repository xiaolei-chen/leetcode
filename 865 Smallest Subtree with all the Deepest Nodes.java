/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution { //求最高高度子树的根节点
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if(root == null) return null;
        Map<TreeNode, Integer> map = new HashMap<>();
        depth(root, map);
        return dfs(root, map);
    }
    private int depth(TreeNode root, Map<TreeNode, Integer> map){
        if(root == null) return 0;
        if(map.containsKey(root)) return map.get(root);
        int max = Math.max(depth(root.left, map), depth(root.right, map)) + 1;
        map.put(root, max);
        return max;
    }
    private TreeNode dfs(TreeNode root, Map<TreeNode, Integer> map){
        int left = depth(root.left, map);
        int right = depth(root.right, map);
        if(right == left) return root;
        return (left > right) ? dfs(root.left, map) : dfs(root.right, map);
    }
}