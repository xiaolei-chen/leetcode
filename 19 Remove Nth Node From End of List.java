/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) return null;
        ListNode pre = head;
        ListNode cur = head;
        for (int i=0; i<n; ++i){
            cur = cur.next;
        }
        //�����ʱcurָ��գ�˵��NΪ����ĳ��ȣ�����Ҫ�Ƴ���Ϊ��Ԫ�أ���ô��ʱ���Ƿ���head.next����
        if (cur == null) return head.next;
        //���cur���ڣ������ټ��������ߣ���ʱpreָ��Ҳ�����ߣ�ֱ��curΪ���һ��Ԫ��ʱֹͣ
        while (cur.next != null) {
            cur = cur.next;
            pre = pre.next;
        }
        //��ʱpreָ��Ҫ�Ƴ�Ԫ�ص�ǰһ��Ԫ�أ��������޸�ָ��������Ҫ�Ƴ���Ԫ�ؼ���
        pre.next = pre.next.next;
        return head;
    }
}