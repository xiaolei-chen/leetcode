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
		while(root != null){ //当cur不为空时
			if(root.left != null){ //如果cur有左子结点
				temp = root.left;
				while(temp.right != null && temp.right != root)
					temp = temp.right; //将pre指针指向cur的左子树中的最右子节点
				if(temp.right != null){ //若pre存在右子节点，遍历右子树
				    if(pre != null && pre.val > root.val){
				        if(first == null){
                            first = pre;
                            second = root;
                        }else{
                            second = root;
                        }
				    }
				    pre = root;
					temp.right = null; //将pre的右子节点置空
					root = root.right; //将cur指针指向pre的右子节点
				}else{ //若pre不存在右子节点，左子树返回
					temp.right = root; //将pre的右子节点指回cur
					root = root.left; //cur指向pre的左子节点
				}
			}else{ //如果cur没有左子结点
				if(pre != null && pre.val > root.val){
				    if(first == null){
                        first = pre;
                        second = root;
                    }else{
                        second = root;
                    }
				}
				pre = root;
				root = root.right; //将cur指针指向pre的右子节点
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