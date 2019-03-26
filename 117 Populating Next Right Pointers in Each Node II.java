/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        TreeLinkNode dummyHead = new TreeLinkNode(0); //dummy���ָ��ÿ����׽���ǰһ����㣬��һ������нڵ㴮������
        TreeLinkNode pre = dummyHead; //preֻ��һ��ָ��
        while (root != null) {
            if (root.left != null) {
                pre.next = root.left;
                pre = pre.next;
            }
            if (root.right != null) {
                pre.next = root.right;
                pre = pre.next;
            }
            root = root.next; //��ʱroot����ƽ��һλ��ָ����nextָ��
            if (root == null) { //��ǰ���Ѿ���������
                pre = dummyHead; //����preΪdummy���
                root = dummyHead.next; //root��ʱΪdummyHead.next������һ����׽��
                dummyHead.next = null; //ָ����գ���ֹ��ѭ��
            }
        }
    }
}