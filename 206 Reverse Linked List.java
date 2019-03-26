/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution { //循环 方法一
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
class Solution { //循环 方法二
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
class Solution { //迭代 方法一
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