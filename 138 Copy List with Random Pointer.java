/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
class Solution { //https://www.cnblogs.com/TenosDoIt/p/3387000.html
    public Node copyRandomList(Node head) {
        if(head == null) return head;
        Node node = head;
        while(node != null){ //让链表变成一个重复链表，就是新旧更替
            Node newNode = new Node(node.val);
            newNode.next = node.next;
            node.next = newNode;
            node = newNode.next;
        }
        node = head;
        while(node != null){ //把旧结点的随机指针赋给新节点的随机指针
            if(node.random != null){
                node.next.random = node.random.next;
            }
            node = node.next.next;
        }
        Node newHead = head.next;
        node = head;
        while(node != null){ //把链表拆成两个
            Node newNode = node.next;
            node.next = newNode.next;
            if(newNode.next != null){
                newNode.next = newNode.next.next;
            }
            node = node.next;
        }
        return newHead;
    }
}