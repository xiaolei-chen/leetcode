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
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        int left = getHeightLeft(root);
        int right = getHeightRight(root);
        if(left == right){ //�����ȣ���˵��������������ֱ�ӷ��ؽڵ���� 2^h -1
            return ((2<<(left)) -1);
        }else{ //�������ȣ���ڵ����Ϊ�������Ľڵ���������������Ľڵ�����ټ�1(���ڵ�)
            return countNodes(root.left)+ countNodes(root.right)+1;
        }
    }
    
    private int getHeightLeft(TreeNode root){
        int count = 0;
        while(root.left != null){
            count++;
            root = root.left;
        }
        return count;
    }
    
    private int getHeightRight(TreeNode root){
        int count = 0;
        while(root.right != null){
            count++;
            root = root.right;
        }
        return count;
    }
}