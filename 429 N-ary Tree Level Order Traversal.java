/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new LinkedList<>();
        if(root == null){
            return res;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> list = new LinkedList<>();
            int n = queue.size();
            for(int i=0; i<n; ++i){
                Node node = queue.poll();
                list.add(node.val);
                for(Node child: node.children){
                    queue.offer(child);
                }
            }
            res.add(list);
        }
        return res;
    }
}