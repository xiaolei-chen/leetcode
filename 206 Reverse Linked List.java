/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution { //ѭ�� ����һ
    public ListNode reverseList(ListNode head) {
        /* iterative solution */
        ListNode preHead = null; //����ָ��
        while (head != null) {
            ListNode next = head.next; //����ָ��
            head.next = preHead; //������
            preHead = head; //�ƶ�ָ��
            head = next; //�ƶ�ָ��
        }
        return preHead;
    }
}


/*
class Solution { //ѭ�� ������
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode dummy = new ListNode(0);
        ListNode cur = head;
        ListNode pre = dummy;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        head.next = null;
        return pre;
    }
}
*/

/*
class Solution { //���� ����һ
    public ListNode reverseList(ListNode head) {
		// recursive solution 
		return reverseListInt(head, null); //����ָ��
	}
	private ListNode reverseListInt(ListNode head, ListNode preHead) {
		if (head == null) return preHead;
		ListNode next = head.next; //����ָ��
		head.next = preHead; //������
		return reverseListInt(next, head); //�ƶ�ָ��
	}
}
*/