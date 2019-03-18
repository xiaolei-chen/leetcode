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
    private int preStart = 0;
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        int n = post.length;
        return construct(pre, post, 0, n-1);
    }
    private TreeNode construct(int[] pre, int[] post, int postStart, int postEnd){
        if(postStart > postEnd) return null;
        int rootVal = post[postEnd];
        TreeNode root = new TreeNode(rootVal);
        preStart++;
        if(preStart == pre.length || postStart == postEnd) return root;
        int leftVal = pre[preStart];
        int lri = postStart;
        for(lri=postStart; lri<=postEnd; lri++){
            if(post[lri] == leftVal){
                break;
            }
        }
        root.left = construct(pre, post, postStart, lri);
        root.right = construct(pre, post, lri+1, postEnd-1);
        return root;
    }
}