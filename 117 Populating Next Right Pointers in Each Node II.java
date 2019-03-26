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
        TreeLinkNode dummyHead = new TreeLinkNode(0); //dummy结点指向每层的首结点的前一个结点，将一层的所有节点串起来！
        TreeLinkNode pre = dummyHead; //pre只是一个指针
        while (root != null) {
            if (root.left != null) {
                pre.next = root.left;
                pre = pre.next;
            }
            if (root.right != null) {
                pre.next = root.right;
                pre = pre.next;
            }
            root = root.next; //此时root向右平移一位，指向其next指针
            if (root == null) { //当前层已经遍历完了
                pre = dummyHead; //重置pre为dummy结点
                root = dummyHead.next; //root此时为dummyHead.next，即下一层的首结点
                dummyHead.next = null; //指针清空，防止死循环
            }
        }
    }
}