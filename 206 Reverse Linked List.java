/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution { //要求迭代 和 循环 两种方法
    public ListNode reverseList(ListNode head) {
        /* iterative solution */
        ListNode preHead = null; //创建指针
        while (head != null) {
            ListNode next = head.next; //创建指针
            head.next = preHead; //换方向
            preHead = head; //移动指针
            head = next; //移动指针
        }
        return preHead;
    }
}


/*
class Solution {
    public ListNode reverseList(ListNode head) {
		// recursive solution 
		return reverseListInt(head, null); //创建指针
	}
	private ListNode reverseListInt(ListNode head, ListNode preHead) {
		if (head == null) return preHead;
		ListNode next = head.next; //创建指针
		head.next = preHead; //换方向
		return reverseListInt(next, head); //移动指着
	}
}
*/