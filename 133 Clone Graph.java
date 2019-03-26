/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};
*/
class Solution { //dfs
    private Map<Node, Node> map = new HashMap<Node, Node>();
    public Node cloneGraph(Node node) {
        if(node == null){
            return null;
        }
        if(map.containsKey(node)){
            return map.get(node);
        }
        Node temp = new Node(node.val, new ArrayList<Node>());
        map.put(node, temp);
        for(Node neighbor : node.neighbors){
            temp.neighbors.add(cloneGraph(neighbor));
        }
        return map.get(node);
    }
}