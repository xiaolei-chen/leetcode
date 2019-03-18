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
        if(N == 1){ //�ڵ���Ϊ1ʱ��ֱ�ӷ��ظ��ڵ㡣�ܹ�ֻ�������������ڵ�
            TreeNode root = new TreeNode(0)
            list.add(root);
            return list;
        }
        for (int leftNum = 1; leftNum <= N-1; leftNum += 2) {
            List<TreeNode> fLeft = allPossibleFBT(leftNum); //��ڵ���Ϊi�����������������
            List<TreeNode> fRight = allPossibleFBT(N-leftNum-1); //�ҽڵ���ΪN-i-1�����������������
            for (TreeNode left: fLeft) { //����������������ϣ����г�������
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