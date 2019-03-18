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
    private Integer prev = null;
    private int count = 1;
    private int max = 0;
    public int[] findMode(TreeNode root) {
        if(root == null) return new int[0];
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        int[] res = new int[list.size()];
        for(int i=0; i<list.size(); ++i){
            res[i] = list.get(i);
        }
        return res;
    }
    private void inorder(TreeNode root, List<Integer> list){
        if(root == null) return;
        inorder(root.left, list);
        if(prev != null){
            if(prev == root.val){
                count++;
            }else{
                count = 1;
            }
        }
        if(count > max){
            max = count;
            list.clear();
            list.add(root.val);
        }else if(count == max){
            list.add(root.val);
        }
        prev = root.val;
        inorder(root.right, list);
    }
}