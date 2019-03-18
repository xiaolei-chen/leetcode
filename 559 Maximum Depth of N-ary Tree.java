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
class Solution { //DFS 
    private int max = 0;
    public int maxDepth(Node root) {
        if(root==null) return 0;
        helper(root, 1);
        return max;
    }
    public void helper(Node node, int depth){
        if(node==null) return;
        max = Math.max(max, depth);
        for(Node child: node.children){
            helper(child, depth+1);
        }
    }
}

/*
class Solution { //BFS 
    public int maxDepth(Node root) {
        if(root == null) return 0;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                Node current = queue.poll();
                for(Node child: current.children){
                    queue.offer(child);
                }
            }
            depth++;
        }
        return depth;
    }
}
*/