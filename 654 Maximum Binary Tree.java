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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums == null) return null;
        return build(nums, 0, nums.length-1);
    }
    private TreeNode build(int[] nums, int left, int right){
        if(left > right) return null;
        int maxId = left;
        for(int i=left; i<=right; ++i){
            if(nums[i] > nums[maxId]){
                maxId = i;
            }
        }
        TreeNode root = new TreeNode(nums[maxId]);
        root.left = build(nums, left, maxId-1);
        root.right = build(nums, maxId+1, right);
        return root;
    }
}