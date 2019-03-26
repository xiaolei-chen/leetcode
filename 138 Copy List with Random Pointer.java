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
        while(node != null){ //��������һ���ظ����������¾ɸ���
            Node newNode = new Node(node.val);
            newNode.next = node.next;
            node.next = newNode;
            node = newNode.next;
        }
        node = head;
        while(node != null){ //�Ѿɽ������ָ�븳���½ڵ�����ָ��
            if(node.random != null){
                node.next.random = node.random.next;
            }
            node = node.next.next;
        }
        Node newHead = head.next;
        node = head;
        while(node != null){ //������������
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