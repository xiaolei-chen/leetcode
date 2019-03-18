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
    private Map<Integer, Integer> map;
    private int maxCount;
    public int[] findFrequentTreeSum(TreeNode root) {
        maxCount = 0;
        map = new HashMap<>();
        postOrder(root);
        List<Integer> list = new ArrayList<>();
        for(int key: map.keySet()){
            if(map.get(key) == maxCount){
                list.add(key);
            }
        }
        int[] res = new int[list.size()];
        for(int i=0; i<list.size(); ++i){
            res[i] = list.get(i);
        }
        return res;
        
    }
    private int postOrder(TreeNode root){
        if(root == null) return 0;
        int left = postOrder(root.left);
        int right = postOrder(root.right);
        int sum = left + right + root.val;
        int count = map.getOrDefault(sum, 0) + 1;
        map.put(sum, count);
        maxCount = Math.max(count, maxCount);
        return sum;
    }
}