/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val; //�ѵ�ǰ�ڵ��ֵ����һ���ڵ��ֵ����
        node.next = node.next.next; //ɾ����һ���ڵ�
    }
}