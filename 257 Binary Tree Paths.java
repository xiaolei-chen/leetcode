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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new LinkedList<>();
        String path = "";
        if(root == null) return res;
        btp(root, path, res);
        return res;
    }
    private void btp(TreeNode root, String path, List<String> res){
        if(root.left==null && root.right==null){
            res.add(path + root.val);
        }
        if(root.left != null){
            btp(root.left, path + root.val + "->", res);
        }
        if(root.right != null){
            btp(root.right, path + root.val + "->", res);
        }
    }
}