/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
 
class Solution {
    public Node connect(Node root) {
        Node levelStart = root;
        while(levelStart != null){
            Node cur = levelStart;
            while(cur != null){
                if(cur.left != null){
                    cur.left.next = cur.right;
                }
                if(cur.right != null && cur.next != null){
                    cur.right.next = cur.next.left;
                }
                cur=cur.next;
            }
            levelStart = levelStart.left;
        }
        return root;
    }
}

 /*
public class Solution {
    public void connect(TreeLinkNode root) {
        if (root == null) return;
        if (root.left != null){
            root.left.next = root.right;
        }
        if (root.right != null){
            root.right.next = (root.next != null) ? root.next.left : null;
        }
        connect(root.left);
        connect(root.right); 
    }
}
*/
