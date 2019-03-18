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
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Stack<Node> stack = new Stack<>();
        stack.add(root);
        while(!stack.empty()){
            root = stack.pop();
            res.add(root.val);
            for(int i=root.children.size()-1; i>=0; --i){
                stack.add(root.children.get(i));
            }
        }
        return res;
    }
}

/*
class Solution {
    public List<Integer> res = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root == null){
            return res;
        }
        res.add(root.val);
        for(Node node: root.children){
            preorder(node);
        }
        return res;
    }
}
*/