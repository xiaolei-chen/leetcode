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
    public int pathSum(TreeNode root, int sum) {
        Map<Integer, Integer> preSum = new HashMap<>(); //<prefix sum, frequency>
        preSum.put(0, 1);
        return helper(root, 0, sum, preSum);  
    }
    private int helper(TreeNode root, int currSum, int target, Map<Integer, Integer> preSum) {
        if (root == null) return 0;
        
        // update the prefix sum by adding the current val
        currSum += root.val;
        
        // get the number of valid path, ended by the current node
        int res = preSum.getOrDefault(currSum-target, 0); 
        
        // update the map with the current sum, so the map is good to be passed to the next recursion
        preSum.put(currSum, preSum.getOrDefault(currSum, 0) + 1);
        
        // add the 3 parts discussed in 8. together
        res += helper(root.left, currSum, target, preSum) + helper(root.right, currSum, target, preSum);
        
       // restore the map, as the recursion goes from the bottom to the top
        preSum.put(currSum, preSum.get(currSum) - 1);
        
        return res;
    }
}