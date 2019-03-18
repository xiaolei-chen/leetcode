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
    public void recoverTree(TreeNode root) {
        TreeNode pre = null;
        TreeNode first = null;
        TreeNode second = null;
        // Morris Traversal
        TreeNode temp = null;
		while(root != null){ //��cur��Ϊ��ʱ
			if(root.left != null){ //���cur�����ӽ��
				temp = root.left;
				while(temp.right != null && temp.right != root)
					temp = temp.right; //��preָ��ָ��cur���������е������ӽڵ�
				if(temp.right != null){ //��pre�������ӽڵ㣬����������
				    if(pre != null && pre.val > root.val){
				        if(first == null){
                            first = pre;
                            second = root;
                        }else{
                            second = root;
                        }
				    }
				    pre = root;
					temp.right = null; //��pre�����ӽڵ��ÿ�
					root = root.right; //��curָ��ָ��pre�����ӽڵ�
				}else{ //��pre���������ӽڵ㣬����������
					temp.right = root; //��pre�����ӽڵ�ָ��cur
					root = root.left; //curָ��pre�����ӽڵ�
				}
			}else{ //���curû�����ӽ��
				if(pre != null && pre.val > root.val){
				    if(first == null){
                        first = pre;
                        second = root;
                    }else{
                        second = root;
                    }
				}
				pre = root;
				root = root.right; //��curָ��ָ��pre�����ӽڵ�
			}
		}
		// swap two node values;
		if(first != null && second != null){
		    int t = first.val;
		    first.val = second.val;
		    second.val = t;
		}
    }
}