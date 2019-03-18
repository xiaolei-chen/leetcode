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
    public List<TreeNode> allPossibleFBT(int N) {
        List<TreeNode> list = new ArrayList<>();
        if(N == 1){ //节点数为1时，直接返回根节点。总共只可能有奇数个节点
            TreeNode root = new TreeNode(0)
            list.add(root);
            return list;
        }
        for (int leftNum = 1; leftNum <= N-1; leftNum += 2) {
            List<TreeNode> fLeft = allPossibleFBT(leftNum); //左节点数为i的所有满二叉树组合
            List<TreeNode> fRight = allPossibleFBT(N-leftNum-1); //右节点数为N-i-1的所有满二叉树组合
            for (TreeNode left: fLeft) { //遍历左右子树的组合，排列出所有树
                for (TreeNode right: fRight) {
                    TreeNode node = new TreeNode(0);
                    node.left = left;
                    node.right = right;
                    list.add(node);
                }
            }
        }
        return list;
    }
}