/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution { //Ҫ����� �� ѭ�� ���ַ���
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
class Solution {
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